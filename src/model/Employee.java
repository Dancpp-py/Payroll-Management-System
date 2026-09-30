package model;

public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;
    private String position;
    private String department;
    private double basicSalary;
    private String dateHired;
    private String employmentStatus;

    public Employee(int employeeID, String firstName, String lastName,
                    String position, String department, double basicSalary,
                    String dateHired, String employmentStatus) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.department = department;
        this.basicSalary = basicSalary;
        this.dateHired = dateHired;
        this.employmentStatus = employmentStatus;
    }

    public int getEmployeeID() { return employeeID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return firstName + " " + lastName; }
    public String getPosition() { return position; }
    public String getDepartment() { return department; }
    public double getBasicSalary() { return basicSalary; }
    public String getDateHired() { return dateHired; }
    public String getEmploymentStatus() { return employmentStatus; }

    public void setFirstName(String v) { firstName = v; }
    public void setLastName(String v) { lastName = v; }
    public void setPosition(String v) { position = v; }
    public void setDepartment(String v) { department = v; }
    public void setBasicSalary(double v) { basicSalary = v; }
    public void setDateHired(String v) { dateHired = v; }
    public void setEmploymentStatus(String v) { employmentStatus = v; }
}