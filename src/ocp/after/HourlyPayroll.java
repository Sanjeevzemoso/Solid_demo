package ocp.after;

public class HourlyPayroll implements PayrollInterface {

    @Override
    public void payRollcal(CalculateSalary1 cal) {
        System.out.println("Hourly sal is 300$");
    }
}
