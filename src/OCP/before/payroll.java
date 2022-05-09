package OCP.before;

import java.util.Date;

public class payroll {

    public void payrollcal(Calculatesalary cal){
        if(cal.salarytype=="Montly") {
            System.out.println("The salary is "+5*cal.name.length());

        }
        else if(cal.salarytype=="Comminsion") {
            System.out.println("The salary is "+15*cal.name.length());
        }
    }
}
