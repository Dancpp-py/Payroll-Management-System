package model;

public class Payroll {
    private int payrollID;
    private int employeeID;
    private String employeeName;
    private String payDate;
    private int daysWorked;
    private double overtimeHours;
    private double bonus;
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;

    public Payroll(int payrollID, int employeeID, String employeeName,
                   String payDate, int daysWorked, double overtimeHours,
                   double bonus, double grossSalary,
                   double totalDeductions, double netSalary) {
        this.payrollID = payrollID;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.payDate = payDate;
        this.daysWorked = daysWorked;
        this.overtimeHours = overtimeHours;
        this.bonus = bonus;
        this.grossSalary = grossSalary;
        this.totalDeductions = totalDeductions;
        this.netSalary = netSalary;
    }

    public int getPayrollID() { return payrollID; }
    public int getEmployeeID() { return employeeID; }
    public String getEmployeeName() { return employeeName; }
    public String getPayDate() { return payDate; }
    public int getDaysWorked() { return daysWorked; }
    public double getOvertimeHours() { return overtimeHours; }
    public double getBonus() { return bonus; }
    public double getGrossSalary() { return grossSalary; }
    public double getTotalDeductions() { return totalDeductions; }
    public double getNetSalary() { return netSalary; }
}