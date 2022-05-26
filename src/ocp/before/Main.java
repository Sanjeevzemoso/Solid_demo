package ocp.before;

public class Main {
    public static void main(String[] args) {
        CalculateSalary csal = new CalculateSalary("sam","Montly");
        Payroll pl = new Payroll();
        pl.payRollcal(csal);

    }
}
