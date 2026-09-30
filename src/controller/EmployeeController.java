package controller;

import database.DatabaseConnection;
import model.Employee;
import model.PasswordUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;

public class EmployeeController {

    public String addEmployee(String employeeIDStr, String firstName,
                               String lastName, String password,
                               String position, String department,
                               String salaryStr, String dateHired) {

        if (employeeIDStr.trim().isEmpty() || firstName.trim().isEmpty()
                || lastName.trim().isEmpty() || password.trim().isEmpty()
                || position.trim().isEmpty() || department.trim().isEmpty()
                || salaryStr.trim().isEmpty() || dateHired.trim().isEmpty()) {
            return "Please fill in all fields.";
        }

        int employeeID;
        try {
            employeeID = Integer.parseInt(employeeIDStr.trim());
        } catch (NumberFormatException e) {
            return "Employee ID must be a valid number.";
        }

        double salary;
        try {
            salary = Double.parseDouble(salaryStr.trim());
        } catch (NumberFormatException e) {
            return "Salary must be a valid number.";
        }

        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "INSERT INTO employees (employee_id, first_name, "
                    + "last_name, password, position, department, "
                    + "basic_salary, date_hired, employment_status) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, 'Active')";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, employeeID);
            pst.setString(2, firstName.trim());
            pst.setString(3, lastName.trim());
            pst.setString(4, PasswordUtil.hashPassword(password));
            pst.setString(5, position.trim());
            pst.setString(6, department.trim());
            pst.setDouble(7, salary);
            pst.setDate(8, java.sql.Date.valueOf(dateHired.trim()));
            pst.executeUpdate();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return "Database error: " + e.getMessage();
        }
    }

    public String updateEmployee(int employeeID, String firstName,
                                  String lastName, String position,
                                  String department, String salaryStr,
                                  String dateHired, String status) {

        if (employeeID == -1) {
            return "Please select an employee first.";
        }
        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()
                || position.trim().isEmpty() || department.trim().isEmpty()
                || salaryStr.trim().isEmpty() || dateHired.trim().isEmpty()
                || status.trim().isEmpty()) {
            return "Please fill in all fields.";
        }

        double salary;
        try {
            salary = Double.parseDouble(salaryStr.trim());
        } catch (NumberFormatException e) {
            return "Salary must be a valid number.";
        }

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE employees SET first_name=?, last_name=?, "
                    + "position=?, department=?, basic_salary=?, "
                    + "date_hired=?, employment_status=? WHERE employee_id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, firstName.trim());
            pst.setString(2, lastName.trim());
            pst.setString(3, position.trim());
            pst.setString(4, department.trim());
            pst.setDouble(5, salary);
            pst.setDate(6, java.sql.Date.valueOf(dateHired.trim()));
            pst.setString(7, status.trim());
            pst.setInt(8, employeeID);
            pst.executeUpdate();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return "Database error: " + e.getMessage();
        }
    }

    public String deleteEmployee(int employeeID) {
        if (employeeID == -1) {
            return "Please select an employee first.";
        }
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE employees SET employment_status = 'Inactive' "
                    + "WHERE employee_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, employeeID);
            pst.executeUpdate();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return "Database error: " + e.getMessage();
        }
    }

    public int[] getEmployeeCounts() {
        int[] counts = new int[3];
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT COUNT(*) AS total, "
                    + "SUM(CASE WHEN employment_status='Active' "
                    + "THEN 1 ELSE 0 END) AS active, "
                    + "SUM(CASE WHEN employment_status='Inactive' "
                    + "THEN 1 ELSE 0 END) AS inactive "
                    + "FROM employees";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                counts[0] = rs.getInt("total");
                counts[1] = rs.getInt("active");
                counts[2] = rs.getInt("inactive");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return counts;
    }


    public String[] getEmployeeDisplayInfo(Object selectedItem) {
        int employeeID = parseEmployeeIDFromSelection(selectedItem);
        if (employeeID == -1) return null;
        Employee emp = getEmployeeByID(employeeID);
        if (emp == null) return null;
        return new String[]{
            emp.getPosition(),
            String.valueOf(emp.getBasicSalary())
        };
    }


    // [0]=id [1]=firstName [2]=lastName [3]=position
    // [4]=department [5]=salary [6]=dateHired [7]=status
    public String[] getEmployeeFieldValues(int employeeID) {
        if (employeeID == -1) return null;
        Employee emp = getEmployeeByID(employeeID);
        if (emp == null) return null;
        return new String[]{
            String.valueOf(emp.getEmployeeID()),
            emp.getFirstName(),
            emp.getLastName(),
            emp.getPosition(),
            emp.getDepartment(),
            String.valueOf(emp.getBasicSalary()),
            emp.getDateHired(),
            emp.getEmploymentStatus()
        };
    }

    public String getSelectedStatus(Object selectedItem) {
        if (selectedItem == null) return "";
        return selectedItem.toString();
    }

    public DefaultComboBoxModel<String> getActiveEmployeeComboModel() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT employee_id, first_name, last_name "
                    + "FROM employees WHERE employment_status = 'Active' "
                    + "ORDER BY employee_id";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addElement(rs.getInt("employee_id") + " - "
                        + rs.getString("first_name") + " "
                        + rs.getString("last_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }

    public DefaultComboBoxModel<String> getAllEmployeeComboModel() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("-- Select Employee --");
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT employee_id, first_name, last_name "
                    + "FROM employees ORDER BY employee_id";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addElement(rs.getInt("employee_id") + " - "
                        + rs.getString("first_name") + " "
                        + rs.getString("last_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }

    public int parseEmployeeIDFromSelection(Object selectedItem) {
        if (selectedItem == null) return -1;
        String s = selectedItem.toString();
        if (s.equals("-- Select Employee --") || !s.contains(" - ")) return -1;
        try {
            return Integer.parseInt(s.split(" - ")[0].trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private Employee getEmployeeByID(int employeeID) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM employees WHERE employee_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, employeeID);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return buildEmployee(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Employee buildEmployee(ResultSet rs) throws Exception {
        return new Employee(
            rs.getInt("employee_id"),
            rs.getString("first_name"),
            rs.getString("last_name"),
            rs.getString("position"),
            rs.getString("department"),
            rs.getDouble("basic_salary"),
            rs.getDate("date_hired").toString(),
            rs.getString("employment_status")
        );
    }
}