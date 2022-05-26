package ocp.after;

public class CommisionPayroll implements PayrollInterface {
    @Override
    public void payRollcal(CalculateSalary1 cal) {
        System.out.println("The commision sal is "+15*cal.name.length());
    }
}
