package controller;

import database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeePayslipController {
    public String[] getPayslipData(int payrollID) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT e.employee_id, e.first_name, e.last_name, "
                    + "e.position, e.department, e.employment_status, "
                    + "e.date_hired, e.basic_salary, "
                    + "p.pay_date, p.overtime_hours, p.thirteen_month, "
                    + "d.sss, d.philhealth, d.pagibig, d.absent, "
                    + "ss.gross_salary, ss.net_salary, ss.total_deductions "
                    + "FROM payroll p "
                    + "JOIN employees e ON p.employee_id = e.employee_id "
                    + "JOIN deductions d ON d.payroll_id = p.payroll_id "
                    + "JOIN salary_summary ss ON ss.payroll_id = p.payroll_id "
                    + "WHERE p.payroll_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, payrollID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                double basicSalary = rs.getDouble("basic_salary");
                double overtimeHours = rs.getDouble("overtime_hours");
                double bonus = rs.getDouble("thirteen_month");
                double grossSalary = rs.getDouble("gross_salary");

                double dailyRate = basicSalary / 22;
                double overtimePay = (dailyRate / 8) * 1.25 * overtimeHours;

                return new String[]{
                    String.valueOf(rs.getInt("employee_id")), // [0]
                    rs.getString("first_name") + " "
                            + rs.getString("last_name"),// [1]
                    rs.getString("position"),// [2]
                    rs.getString("department"),// [3]
                    rs.getString("employment_status"), // [4]
                    rs.getDate("date_hired").toString(),// [5]
                    rs.getDate("pay_date").toString(), // [6]
                    String.format("%.2f", basicSalary),// [7]
                    String.format("%.2f", overtimePay),// [8]
                    String.format("%.2f", bonus),// [9]
                    String.format("%.2f", grossSalary),// [10]
                    String.format("%.2f", rs.getDouble("sss")),// [11]
                    String.format("%.2f", rs.getDouble("philhealth")),// [12]
                    String.format("%.2f", rs.getDouble("pagibig")),// [13]
                    String.format("%.2f", rs.getDouble("absent")),// [14]
                    String.format("%.2f", rs.getDouble("net_salary"))// [15]
                };
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public String validatePayslipData(int payrollID) {
        if (payrollID == -1) return "Invalid payroll ID.";
        if (getPayslipData(payrollID) == null) return "Payslip not found.";
        return null;
    }
}
