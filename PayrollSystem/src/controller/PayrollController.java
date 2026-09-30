package controller;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PayrollController {

    public void insertPayroll(
        int employeeID,
        java.sql.Date payDate,
        int daysWorked,
        double overtime,
        double bonus,
        double basicSalary,
        int totalWorkDays
    ) {
        try {
            Connection conn = DatabaseConnection.getConnection();

            String payrollSql = "INSERT INTO payroll (employee_id, pay_date, days_worked, overtime_hours, thirteen_month) "
                              + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement payrollStmt = conn.prepareStatement(payrollSql, PreparedStatement.RETURN_GENERATED_KEYS);

            payrollStmt.setInt(1, employeeID);
            payrollStmt.setDate(2, payDate);
            payrollStmt.setInt(3, daysWorked);
            payrollStmt.setDouble(4, overtime);
            payrollStmt.setDouble(5, bonus);

            payrollStmt.executeUpdate();

            ResultSet rs = payrollStmt.getGeneratedKeys();
            int payrollId = 0;
            if (rs.next()) {
                payrollId = rs.getInt(1);
            }

            ContributionResult contributions = calculateContributions(basicSalary, daysWorked, totalWorkDays, overtime);

            String deductionSql = "INSERT INTO deductions (payroll_id, sss, philhealth, pagibig, absent) "
                                + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement deductionStmt = conn.prepareStatement(deductionSql);

            deductionStmt.setInt(1, payrollId);
            deductionStmt.setDouble(2, contributions.sss);
            deductionStmt.setDouble(3, contributions.philhealth);
            deductionStmt.setDouble(4, contributions.pagibig);
            deductionStmt.setDouble(5, contributions.absent);

            deductionStmt.executeUpdate();

            double dailyRate = basicSalary / totalWorkDays;
            double earnedSalary = dailyRate * daysWorked;
            double overtimePay = (dailyRate / 8) * 1.25 * overtime;
            double grossSalary = earnedSalary + overtimePay + bonus;
            double netSalary = grossSalary - contributions.total;

            String summarySql = "INSERT INTO salary_summary (payroll_id, gross_salary, net_salary, total_deductions) "
                              + "VALUES (?, ?, ?, ?)";
            PreparedStatement summaryStmt = conn.prepareStatement(summarySql);
            summaryStmt.setInt(1, payrollId);
            summaryStmt.setDouble(2, grossSalary);
            summaryStmt.setDouble(3, netSalary);
            summaryStmt.setDouble(4, contributions.total);

            summaryStmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Payroll generated successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static class ContributionResult {
        public double total;
        public String details;
        public double sss;
        public double philhealth;
        public double pagibig;
        public double absent;

        public ContributionResult(double total, String details) {
            this.total = total;
            this.details = details;
        }
    }

    public ContributionResult calculateContributions(double basicSalary, int daysWorked, int totalWorkDays, double overtime) {
        double dailyRate = basicSalary / totalWorkDays;

        double earnedSalary = dailyRate * daysWorked;
        double absentDeduction = basicSalary - earnedSalary;

        double sss = earnedSalary * 0.05;
        double philHealth = earnedSalary * 0.025;
        double pagibig = earnedSalary * 0.01;
        double total = absentDeduction + sss + philHealth + pagibig;

        String details = String.format("SSS: %.2f | PhilHealth: %.2f | Pag-IBIG: %.2f | Absent: %.2f",
                                       sss, philHealth, pagibig, absentDeduction);

        ContributionResult result = new ContributionResult(total, details);
        result.sss = sss;
        result.philhealth = philHealth;
        result.pagibig = pagibig;
        result.absent = absentDeduction;

        return result;
    }
    
        public javax.swing.table.DefaultTableModel getPayrollSummary() {
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
            new String[]{"Employee", "Gross", "Deduction", "Net Pay"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT CONCAT(e.first_name, ' ', e.last_name) AS employee, " +
                         "ss.gross_salary, ss.total_deductions, ss.net_salary " +
                         "FROM salary_summary ss " +
                         "JOIN payroll p ON ss.payroll_id = p.payroll_id " +
                         "JOIN employees e ON p.employee_id = e.employee_id " +
                         "ORDER BY p.pay_date DESC";

            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("employee"),
                    String.format("%.2f", rs.getDouble("gross_salary")),
                    String.format("%.2f", rs.getDouble("total_deductions")),
                    String.format("%.2f", rs.getDouble("net_salary"))
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to load payroll data: " + e.getMessage());
        }

        return model;
    }
        
    public javax.swing.table.DefaultTableModel getPayrollHistory() {
    javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
        new String[]{"Employee ID", "Name", "Period", "Net Pay"}, 0
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = "SELECT e.employee_id, " +
                     "CONCAT(e.first_name, ' ', e.last_name) AS name, " +
                     "p.pay_date, " +
                     "ss.net_salary " +
                     "FROM payroll p " +
                     "JOIN employees e ON p.employee_id = e.employee_id " +
                     "JOIN salary_summary ss ON ss.payroll_id = p.payroll_id " +
                     "ORDER BY p.pay_date DESC";

        PreparedStatement pst = conn.prepareStatement(sql);
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
        JOptionPane.showMessageDialog(null, "Failed to load payroll history: " + e.getMessage());
    }

    return model;
}    
}