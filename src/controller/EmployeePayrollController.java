package controller;

import database.DatabaseConnection;
import model.Session;
import model.PayrollRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollController {
    
    public List<PayrollRecord> getPayrollRecords() {
        List<PayrollRecord> records = new ArrayList<>();
        
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT p.payroll_id, p.pay_date, "
                    + "ss.gross_salary, ss.total_deductions, ss.net_salary "
                    + "FROM payroll p "
                    + "JOIN salary_summary ss ON ss.payroll_id = p.payroll_id "
                    + "WHERE p.employee_id = ? "
                    + "ORDER BY p.pay_date DESC";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, Session.getUserID());
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                PayrollRecord record = new PayrollRecord(
                    rs.getInt("payroll_id"),
                    rs.getDate("pay_date").toString(),
                    rs.getDouble("gross_salary"),
                    rs.getDouble("total_deductions"),
                    rs.getDouble("net_salary")
                );
                records.add(record);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return records;
    }
    
    public int getPayrollIDForRow(int rowIndex) {
        List<PayrollRecord> records = getPayrollRecords();
        if (rowIndex >= 0 && rowIndex < records.size()) {
            return records.get(rowIndex).getPayrollId();
        }
        return -1;
    }
}