package controller;

import database.DatabaseConnection;
import model.PasswordUtil;
import model.Session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeLoginController {

   public String login(String employeeIDStr, String password) {
        if (employeeIDStr == null || employeeIDStr.trim().isEmpty()) {
            return "Please enter a username.";
        }
        if (password == null || password.trim().isEmpty()) {
            return "Please enter a password.";
        }
        
        int employeeID;
        try {
            employeeID = Integer.parseInt(employeeIDStr.trim());
        } catch (NumberFormatException e) {
            return "Employee ID must be a number.";
        }
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM employees WHERE employee_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, employeeID);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String storedPassword = rs.getString("password");
                String hashedInput = PasswordUtil.hashPassword(password);
                if (storedPassword.equals(hashedInput)) {
                    String empName = rs.getString("first_name");
                    Session.startSession(employeeID, empName, "EMPLOYEE");
                    return null;
                }
            }
            return "Invalid username or password.";
        } catch (Exception e) {
            e.printStackTrace();
            return "Database error: " + e.getMessage();
        }
    }
}