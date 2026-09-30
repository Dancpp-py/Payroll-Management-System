package controller;

import database.DatabaseConnection;
import model.PasswordUtil;
import model.Session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginController {

    public String login(String username, String password) {
        if (username == null || username.trim().isEmpty()) {
            return "Please enter a username.";
        }
        if (password == null || password.trim().isEmpty()) {
            return "Please enter a password.";
        }
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM admin WHERE username = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username.trim());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String storedPassword = rs.getString("password");
                String hashedInput = PasswordUtil.hashPassword(password);
                if (storedPassword.equals(hashedInput)) {
                    int adminID = rs.getInt("admin_id");
                    String adminName = rs.getString("username");
                    Session.startSession(adminID, adminName, "ADMIN");
                    return null; // success
                }
            }
            return "Invalid username or password.";
        } catch (Exception e) {
            e.printStackTrace();
            return "Database error: " + e.getMessage();
        }
    }
}