package OCP.after;




public class Main {
    public static void main(String[] args) {
        Calculatesalary person = new Calculatesalary("sam","Montly");
        Montlypayroll mp = new Montlypayroll();
        mp.payrollcal(person);
        Commisionpayroll cmpr = new Commisionpayroll();
        cmpr.payrollcal((person));
        Hourlypayroll hprl = new Hourlypayroll();
        hprl.payrollcal(person);


    }
}
