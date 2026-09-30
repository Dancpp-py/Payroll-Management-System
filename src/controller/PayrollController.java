package controller;

import database.DatabaseConnection;
import model.ContributionResult;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;

public class PayrollController {

    private static final int TOTAL_WORK_DAYS = 22;

    private ContributionResult calculateContributions(double basicSalary,
                                                       int daysWorked,
                                                       double overtimeHours) {
        double dailyRate = basicSalary / TOTAL_WORK_DAYS;
        double earnedSalary = dailyRate * daysWorked;
        double overtimePay = (dailyRate / 8) * 1.25 * overtimeHours;
        double taxableIncome = earnedSalary + overtimePay;
        double sss = taxableIncome * 0.05;
        double philHealth = taxableIncome * 0.025;
        double pagIbig = taxableIncome * 0.01;
        double absentDeduction = basicSalary - earnedSalary;
        return new ContributionResult(sss, philHealth, pagIbig, absentDeduction);
    }

    private double calculateGross(double basicSalary, int daysWorked,
                                   double overtimeHours, double bonus) {
        double dailyRate = basicSalary / TOTAL_WORK_DAYS;
        double earnedSalary = dailyRate * daysWorked;
        double overtimePay = (dailyRate / 8) * 1.25 * overtimeHours;
        return earnedSalary + overtimePay + bonus;
    }

    public String[] getDeductionPreview(String basicSalaryStr,
                                         String daysWorkedStr,
                                         String overtimeStr,
                                         String bonusStr) {
        try {
            double basicSalary = Double.parseDouble(
                    basicSalaryStr.trim().isEmpty() ? "0" : basicSalaryStr.trim());
            int daysWorked = daysWorkedStr.trim().isEmpty() ? 0
                    : Integer.parseInt(daysWorkedStr.trim());
            double overtime = overtimeStr.trim().isEmpty() ? 0
                    : Double.parseDouble(overtimeStr.trim());
            double bonus = bonusStr.trim().isEmpty() ? 0
                    : Double.parseDouble(bonusStr.trim());

            ContributionResult result = calculateContributions(
                    basicSalary, daysWorked, overtime);
            return new String[]{
                result.getDetails(),
                result.getTotalDeductionFormatted()
            };
        } catch (Exception e) {
            return new String[]{
                "SSS: 0.00 | PhilHealth: 0.00 | Pag-IBIG: 0.00 | Absent: 0.00",
                "0.00"
            };
        }
    }

    public String insertPayroll(String employeeIDStr, String daysWorkedStr,
                                 String overtimeStr, String bonusStr,
                                 String basicSalaryStr) {

        if (employeeIDStr == null || employeeIDStr.trim().isEmpty()) {
            return "Please select an employee.";
        }

        int employeeID;
        try {
            employeeID = Integer.parseInt(employeeIDStr.trim());
        } catch (NumberFormatException e) {
            return "Invalid employee selection.";
        }

        if (employeeID == -1) {
            return "Please select an employee.";
        }

        if (daysWorkedStr.trim().isEmpty()) {
            return "Please enter days worked.";
        }

        int daysWorked;
        try {
            daysWorked = Integer.parseInt(daysWorkedStr.trim());
        } catch (NumberFormatException e) {
            return "Days worked must be a valid number.";
        }

        double overtime;
        try {
            overtime = overtimeStr.trim().isEmpty() ? 0
                    : Double.parseDouble(overtimeStr.trim());
        } catch (NumberFormatException e) {
            return "Overtime hours must be a valid number.";
        }

        double bonus;
        try {
            bonus = bonusStr.trim().isEmpty() ? 0
                    : Double.parseDouble(bonusStr.trim());
        } catch (NumberFormatException e) {
            return "Bonus must be a valid number.";
        }

        double basicSalary;
        try {
            basicSalary = Double.parseDouble(basicSalaryStr.trim());
        } catch (NumberFormatException e) {
            return "Invalid salary data.";
        }

        if (daysWorked < 0 || daysWorked > TOTAL_WORK_DAYS) {
            return "Days worked must be between 0 and " + TOTAL_WORK_DAYS + ".";
        }

        try {
            Connection conn = DatabaseConnection.getConnection();
            java.sql.Date payDate =
                    java.sql.Date.valueOf(java.time.LocalDate.now());

            String payrollSql = "INSERT INTO payroll (employee_id, pay_date, "
                    + "days_worked, overtime_hours, thirteen_month) "
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement payrollStmt = conn.prepareStatement(
                    payrollSql, PreparedStatement.RETURN_GENERATED_KEYS);
            payrollStmt.setInt(1, employeeID);
            payrollStmt.setDate(2, payDate);
            payrollStmt.setInt(3, daysWorked);
            payrollStmt.setDouble(4, overtime);
            payrollStmt.setDouble(5, bonus);
            payrollStmt.executeUpdate();

            ResultSet rs = payrollStmt.getGeneratedKeys();
            if (!rs.next()) return "Failed to generate payroll ID.";
            int payrollId = rs.getInt(1);

            ContributionResult contributions =
                    calculateContributions(basicSalary, daysWorked, overtime);
            double grossSalary =
                    calculateGross(basicSalary, daysWorked, overtime, bonus);
            double netSalary = grossSalary - contributions.getTotal();

            String deductionSql = "INSERT INTO deductions "
                    + "(payroll_id, sss, philhealth, pagibig, absent) "
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement deductionStmt = conn.prepareStatement(deductionSql);
            deductionStmt.setInt(1, payrollId);
            deductionStmt.setDouble(2, contributions.getSss());
            deductionStmt.setDouble(3, contributions.getPhilHealth());
            deductionStmt.setDouble(4, contributions.getPagIbig());
            deductionStmt.setDouble(5, contributions.getAbsentDeduction());
            deductionStmt.executeUpdate();

            String summarySql = "INSERT INTO salary_summary "
                    + "(payroll_id, gross_salary, net_salary, total_deductions) "
                    + "VALUES (?, ?, ?, ?)";
            PreparedStatement summaryStmt = conn.prepareStatement(summarySql);
            summaryStmt.setInt(1, payrollId);
            summaryStmt.setDouble(2, grossSalary);
            summaryStmt.setDouble(3, netSalary);
            summaryStmt.setDouble(4, contributions.getTotal());
            summaryStmt.executeUpdate();

            return null;

        } catch (Exception e) {
            e.printStackTrace();
            return "Database error: " + e.getMessage();
        }
    }

    public DefaultTableModel getPayrollSummaryTableModel() {
        String[] columns = {"Employee", "Gross", "Deduction", "Net Pay"};
        DefaultTableModel model = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int r, int c) { return false; }
        };
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT CONCAT(e.first_name,' ',e.last_name) AS name, "
                    + "ss.gross_salary, ss.total_deductions, ss.net_salary "
                    + "FROM payroll p "
                    + "JOIN employees e ON p.employee_id = e.employee_id "
                    + "JOIN salary_summary ss ON ss.payroll_id = p.payroll_id "
                    + "ORDER BY p.pay_date DESC";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("name"),
                    String.format("%.2f", rs.getDouble("gross_salary")),
                    String.format("%.2f", rs.getDouble("total_deductions")),
                    String.format("%.2f", rs.getDouble("net_salary"))
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }

    public DefaultTableModel getPayrollHistoryTableModel(String searchTerm) {
        String[] columns = {"Employee ID", "Name", "Period", "Net Pay"};
        DefaultTableModel model = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int r, int c) { return false; }
        };
        try (Connection conn = DatabaseConnection.getConnection()) {
            String pattern = "%"
                    + (searchTerm == null ? "" : searchTerm.trim()) + "%";
            String sql = "SELECT e.employee_id, "
                    + "CONCAT(e.first_name,' ',e.last_name) AS name, "
                    + "p.pay_date, ss.net_salary "
                    + "FROM payroll p "
                    + "JOIN employees e ON p.employee_id = e.employee_id "
                    + "JOIN salary_summary ss ON ss.payroll_id = p.payroll_id "
                    + "WHERE LOWER(e.first_name) LIKE LOWER(?) OR "
                    + "LOWER(e.last_name) LIKE LOWER(?) OR "
                    + "LOWER(CONCAT(e.first_name,' ',e.last_name)) LIKE LOWER(?) OR "
                    + "CAST(e.employee_id AS CHAR) LIKE ? "
                    + "ORDER BY p.payroll_id DESC";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, pattern);
            pst.setString(2, pattern);
            pst.setString(3, pattern);
            pst.setString(4, pattern);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("employee_id"),
                    rs.getString("name"),
                    rs.getDate("pay_date").toString(),
                    String.format("%.2f", rs.getDouble("net_salary"))
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }

    public DefaultTableModel getPayrollHistoryTableModel() {
        return getPayrollHistoryTableModel("");
    }

    public String getSearchNoResultMessage(DefaultTableModel model) {
        if (model.getRowCount() == 0) {
            return "No records found.";
        }
        return null;
    }
    
    public DefaultTableModel getEmployeePayrollHistoryTableModel(int employeeId) {
    String[] columns = {"Pay Period", "Gross", "Deduction", "Net Pay", "Action"};
    DefaultTableModel model = new DefaultTableModel(columns, 0) {
        @Override
        public boolean isCellEditable(int r, int c) { return false; }
    };
    
    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = "SELECT p.payroll_id, p.pay_date, "
                + "ss.gross_salary, ss.total_deductions, ss.net_salary "
                + "FROM payroll p "
                + "JOIN salary_summary ss ON ss.payroll_id = p.payroll_id "
                + "WHERE p.employee_id = ? "
                + "ORDER BY p.pay_date DESC";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, employeeId);
        ResultSet rs = pst.executeQuery();
        
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getDate("pay_date").toString(),
                String.format("%.2f", rs.getDouble("gross_salary")),
                String.format("%.2f", rs.getDouble("total_deductions")),
                String.format("%.2f", rs.getDouble("net_salary")),
                "View"
            });
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return model;
}

public List<Integer> getEmployeePayrollIds(int employeeId) {
    List<Integer> ids = new ArrayList<>();
    
    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = "SELECT payroll_id FROM payroll "
                + "WHERE employee_id = ? ORDER BY pay_date DESC";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, employeeId);
        ResultSet rs = pst.executeQuery();
        
        while (rs.next()) {
            ids.add(rs.getInt("payroll_id"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return ids;
}
}