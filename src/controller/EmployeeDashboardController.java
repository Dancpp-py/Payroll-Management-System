package controller;

import database.DatabaseConnection;
import model.Session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDashboardController {
    
    public String[] getLastPayrollSummary() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT e.basic_salary, ss.total_deductions, ss.net_salary "
                    + "FROM payroll p "
                    + "JOIN employees e ON p.employee_id = e.employee_id "
                    + "JOIN salary_summary ss ON ss.payroll_id = p.payroll_id "
                    + "WHERE p.employee_id = ? "
                    + "ORDER BY p.pay_date DESC LIMIT 1";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, Session.getUserID());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return new String[]{
                    String.format("%.2f", rs.getDouble("basic_salary")),
                    String.format("%.2f", rs.getDouble("total_deductions")),
                    String.format("%.2f", rs.getDouble("net_salary"))
                };
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public String[] getEmploymentInfo(){
        try(Connection conn = DatabaseConnection.getConnection()){
            String sql = "SELECT employment_status, department, date_hired "
                    + "FROM employees WHERE employee_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, Session.getUserID());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return new String[]{
                    rs.getString("employment_status"),
                    rs.getString("department"),
                    rs.getDate("date_hired").toString()
                };
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public String getWelcomeMessage(){
        return "Welcome, "+ Session.getUsername() + "!";
    }
    
    public String getPayrollSummaryDisplay(){
        String[] data = getLastPayrollSummary();
        if(data == null){
            return "No payroll record found.";
        }
        return "Basic Pay: "+data[0] +
                " | Deductions: " + data[1]+
                " | Net pay: " + data[2];
    }
    
    public String getEmploymentInfoDisplay(){
        String[] data = getEmploymentInfo();
        if (data == null) {
            return "No employment record found.";
        }
        return "Status: " + data[0]
                + "  |  Dept: " + data[1]
                + "  |  Date Hired: " + data[2];
    }
    
}


