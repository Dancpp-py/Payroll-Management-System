package controller;

import database.DatabaseConnection;
import model.PasswordUtil;
import model.Session;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ChangePasswordController {
   public String changePassword(String oldPassword, String newPassword, String confirmPassword) {
        
        if (oldPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            return "Please fill in all fields!";
        }
        if (!newPassword.equals(confirmPassword)) {
            return "New passwords do not match!";
        }
        if (newPassword.length() < 6) {
            return "New password must be at least 6 characters!";
        }

        int employeeID = Session.getUserID();

        try (Connection conn = DatabaseConnection.getConnection()) {

            String checkSql = "SELECT password FROM employees WHERE employee_id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setInt(1, employeeID);
            ResultSet rs = checkStmt.executeQuery();

            if (!rs.next()) {
                return "Employee not found!";
            }

            String storedHash = rs.getString("password");
            String oldHashed = PasswordUtil.hashPassword(oldPassword);

            if (!storedHash.equals(oldHashed)) {
                return "Old password is incorrect!";
            }

            String hashedNew = PasswordUtil.hashPassword(newPassword);
            String updateSql = "UPDATE employees SET password = ? WHERE employee_id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setString(1, hashedNew);
            updateStmt.setInt(2, employeeID);
            updateStmt.executeUpdate();

            return null;

        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
