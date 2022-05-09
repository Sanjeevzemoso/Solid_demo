package OCP.after;

public class Commisionpayroll implements  payrollInterface {
    @Override
    public void payrollcal(Calculatesalary cal) {
        System.out.println("The commision sal is "+15*cal.name.length());
    }
}
