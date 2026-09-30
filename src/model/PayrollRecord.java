package model;

public class PayrollRecord {
    private int payrollId;
    private String payDate;
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;
    
    public PayrollRecord(int payrollId, String payDate, double grossSalary, 
                        double totalDeductions, double netSalary) {
        this.payrollId = payrollId;
        this.payDate = payDate;
        this.grossSalary = grossSalary;
        this.totalDeductions = totalDeductions;
        this.netSalary = netSalary;
    }
    
    // Getters
    public int getPayrollId() { return payrollId; }
    public String getPayDate() { return payDate; }
    public double getGrossSalary() { return grossSalary; }
    public double getTotalDeductions() { return totalDeductions; }
    public double getNetSalary() { return netSalary; }
}