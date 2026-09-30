package controller;

import database.DatabaseConnection;
import model.PasswordUtil;
import model.Session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class AdminLoginController {
    
    public boolean loginAdmin(String username, String password){
        try{
            Connection conn = DatabaseConnection.getConnection();
            
            String sql = "SELECT * FROM admin where username = ?";
            
            PreparedStatement pst = conn.prepareCall(sql);
            pst.setString(1, username);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String storedPassword = rs.getString("password");
                String hashedInput = PasswordUtil.hashPassword(password);
                
                if(storedPassword.equals(password)){
                    int adminID = rs.getInt("admin_id");
                    
                    Session.startSession(adminID, sql, "ADMIN");
                    
                    return true;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
