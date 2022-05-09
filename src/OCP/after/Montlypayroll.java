package OCP.after;



public class Montlypayroll implements payrollInterface {

    @Override
    public void payrollcal(Calculatesalary cal){


            System.out.println("The salary is "+5*cal.name.length());
    }



}
