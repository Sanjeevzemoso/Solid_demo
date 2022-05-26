package ocp.after;




public class Main {
    public static void main(String[] args) {
        CalculateSalary1 person = new CalculateSalary1("sam","Montly");
        Montlypayroll mp = new Montlypayroll();
        mp.payRollcal(person);
        CommisionPayroll cmpr = new CommisionPayroll();
        cmpr.payRollcal((person));
        HourlyPayroll hprl = new HourlyPayroll();
        hprl.payRollcal(person);


    }
}
