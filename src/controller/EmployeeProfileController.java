package controller;

import database.DatabaseConnection;
import model.Session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeProfileController {
    public String[] getEmployeeProfile(){
        try (Connection conn = DatabaseConnection.getConnection()){
            String sql = "SELECT employee_id, first_name, last_name, position, "
                    + "department, employment_status, date_hired "
                    + "FROM employees WHERe employee_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, Session.getUserID());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return new String[]{
                    String.valueOf(rs.getInt("employee_id")),
                    rs.getString("first_name") + " " + rs.getString("last_name"),
                    rs.getString("position"),
                    rs.getString("department"),
                    rs.getString("employment_status"),
                    rs.getDate("date_hired").toString()
                };
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public String getProfileError(){
        if(getEmployeeProfile() == null){
            return "No profile found.";
        }
        return null;
    }
    
}
