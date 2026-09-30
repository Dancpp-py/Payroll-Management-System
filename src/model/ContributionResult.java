package model;

public class ContributionResult {
    private double sss;
    private double philHealth;
    private double pagIbig;
    private double absentDeduction;
    private double total;
    private String details;
    private String totalDeductionFormatted;

    public ContributionResult(double sss, double philHealth,
                               double pagIbig, double absentDeduction) {
        this.sss = sss;
        this.philHealth = philHealth;
        this.pagIbig = pagIbig;
        this.absentDeduction = absentDeduction;
        this.total = sss + philHealth + pagIbig + absentDeduction;
        this.details = String.format(
            "SSS: %.2f | PhilHealth: %.2f | Pag-IBIG: %.2f | Absent: %.2f",
            sss, philHealth, pagIbig, absentDeduction);
        this.totalDeductionFormatted = String.format("%.2f", this.total);
    }

    public double getSss() { return sss; }
    public double getPhilHealth() { return philHealth; }
    public double getPagIbig() { return pagIbig; }
    public double getAbsentDeduction() { return absentDeduction; }
    public double getTotal() { return total; }
    public String getDetails() { return details; }
    public String getTotalDeductionFormatted() { return totalDeductionFormatted; }
}