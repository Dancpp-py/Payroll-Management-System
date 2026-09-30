
package controller;

import database.DatabaseConnection;
import model.PasswordUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class EmployeeController {

    public void insertEmployee(int employeeID, String firstName, String lastName,
                               String password, String position, String department,
                               double salary, String dateHired) {

        try {

            Connection conn = DatabaseConnection.getConnection();

            String sql = "INSERT INTO employees "
                    + "(employee_id, first_name, last_name, password, position, department, basic_salary, date_hired) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(sql);
            
            String hashedPassword = PasswordUtil.hashPassword(password);

            pst.setInt(1, employeeID);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            pst.setString(4, hashedPassword);
            pst.setString(5, position);
            pst.setString(6, department);
            pst.setDouble(7, salary);
            pst.setDate(8, java.sql.Date.valueOf(dateHired));
            pst.executeUpdate();


        } catch (Exception e) {
            
        }

    }
    
    public int[] getEmployeeCounts() {
        int[] counts = new int[3]; // [0] = total, [1] = active, [2] = inactive

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT " +
                         "COUNT(*) AS total, " +
                         "SUM(CASE WHEN employment_status = 'Active' THEN 1 ELSE 0 END) AS active, " +
                         "SUM(CASE WHEN employment_status = 'Inactive' THEN 1 ELSE 0 END) AS inactive " +
                         "FROM employees";

            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                counts[0] = rs.getInt("total");
                counts[1] = rs.getInt("active");
                counts[2] = rs.getInt("inactive");
            }

        } catch (Exception e) {
            
        }

        return counts;
    }
    
    public void updateEmployee(int employeeID, String firstName, String lastName,
                           String position, String department, double salary,
                           String dateHired, String status) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE employees SET first_name=?, last_name=?, position=?, " +
                         "department=?, basic_salary=?, date_hired=?, employment_status=? " +
                         "WHERE employee_id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, position);
            pst.setString(4, department);
            pst.setDouble(5, salary);
            pst.setDate(6, java.sql.Date.valueOf(dateHired));
            pst.setString(7, status);
            pst.setInt(8, employeeID);
            pst.executeUpdate();

        } catch (Exception e) {
            
        }
    }

    public void deleteEmployee(int employeeID) {
        try (Connection conn = DatabaseConnection.getConnection()) {

        String sql = "UPDATE employees SET employment_status = 'Inactive' WHERE employee_id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, employeeID);
        pst.executeUpdate();
        
        } catch (Exception e) {

        }
    }

    public ResultSet getEmployeeByID(int employeeID) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM employees WHERE employee_id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, employeeID);
            return pst.executeQuery();
        } catch (Exception e) {      
            return null;
        }
    }
    
    public java.util.List<String> getAllEmployees() {
    java.util.List<String> employees = new java.util.ArrayList<>();

    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = "SELECT employee_id, first_name, last_name FROM employees ORDER BY employee_id";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            employees.add(rs.getInt("employee_id") + " - " + 
                         rs.getString("first_name") + " " + rs.getString("last_name"));
        }

    } catch (Exception e) {
        
    }
    return employees;
    }  
}
