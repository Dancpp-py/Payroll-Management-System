package controller;

import database.DatabaseConnection;
import model.MailSender;
import model.PasswordUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.UUID;

public class ForgotPasswordController {
    public boolean sendTempPassword(int employeeID, String email) {
    try (Connection conn = DatabaseConnection.getConnection()) {
        String checkSql = "SELECT employee_id FROM employees WHERE employee_id = ?";
        PreparedStatement checkStmt = conn.prepareStatement(checkSql);
        checkStmt.setInt(1, employeeID);
        ResultSet rs = checkStmt.executeQuery();
        if (!rs.next()) {
            return false;
        }
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(null, "DB Error: " + e.getMessage());
        return false;
    }

    String tempPassword = java.util.UUID.randomUUID().toString().substring(0, 8);
    try (Connection conn = DatabaseConnection.getConnection()) {
        String hashedTemp = PasswordUtil.hashPassword(tempPassword);
        String updateSql = "UPDATE employees SET password = ? WHERE employee_id = ?";
        PreparedStatement updateStmt = conn.prepareStatement(updateSql);
        updateStmt.setString(1, hashedTemp);
        updateStmt.setInt(2, employeeID);
        updateStmt.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(null, "Update Error: " + e.getMessage());
        return false;
    }

    MailSender.sendTempPassword(email, tempPassword);
    return true;
}
}
