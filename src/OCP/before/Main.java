package OCP.before;

public class Main {
    public static void main(String[] args) {
        Calculatesalary csal = new Calculatesalary("sam","Montly");
        payroll pl = new payroll();
        pl.payrollcal(csal);

    }
}
