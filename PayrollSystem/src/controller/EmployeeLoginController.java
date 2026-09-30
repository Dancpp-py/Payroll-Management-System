
package controller;

import database.DatabaseConnection;
import model.PasswordUtil;
import model.Session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class EmployeeLoginController {
    
   public boolean loginEmployee(int employeeID, String password){
       try{
           Connection conn = DatabaseConnection.getConnection();
           
           String sql = "SELECT * FROM employees where employee_id = ? AND employment_stats = 'Active'";
           
           PreparedStatement pst = conn.prepareStatement(sql);
           pst.setInt(1, employeeID);
           
           ResultSet rs = pst.executeQuery();
           
           if(rs.next()){
               String storedPassword = rs.getString("password");
               String hashedInput = PasswordUtil.hashPassword(password);
               
               if(storedPassword.equals(hashedInput)){
                   String name = rs.getString("first_name");
                   
                   Session.startSession(employeeID, name, "EMPLOYEE");
                   
                   return true;
                           
               }
           }
       } catch(Exception e){
           e.printStackTrace();
       }
       return false;
   }
}
