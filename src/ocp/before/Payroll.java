package ocp.before;

public class Payroll {

    public void payRollcal(CalculateSalary cal){
        if(cal.salarytype=="Montly") {
            System.out.println("The salary is "+5*cal.name.length());

        }
        else if(cal.salarytype=="Comminsion") {
            System.out.println("The salary is "+15*cal.name.length());
        }

    }
}
