package ocp.after;



public class Montlypayroll implements PayrollInterface {

    @Override
    public void payRollcal(CalculateSalary1 cal){


            System.out.println("The salary is "+5*cal.name.length());
    }



}
