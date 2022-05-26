
import Interfacesegregation.after.Iphone1;
import Interfacesegregation.after.Samsung1;
import Interfacesegregation.before.Iphone;
import Interfacesegregation.before.Samsung;
import liskov.after.AlibabaCustomer1;
import liskov.after.AmazonCustomer1;
import liskov.before.AlibabaCustomer;
import liskov.before.AmazonCustomer;
import ocp.after.CalculateSalary1;
import ocp.after.CommisionPayroll;
import ocp.after.HourlyPayroll;
import ocp.after.Montlypayroll;
import ocp.before.CalculateSalary;
import ocp.before.Payroll;
import dependencyinversion.after.GooglePay1;
import dependencyinversion.after.PhonePay1;
import dependencyinversion.after.payment;
import dependencyinversion.before.PaymentSystem;
import singleresponsibility.after.ComputerI;
import singleresponsibility.after.DeliveryManager;
import singleresponsibility.after.InformationManager;
import singleresponsibility.before.Computer;

public class Main {
    public static void main(String[] args) {


        //single responsibility principle


        //before

        Computer computer = new Computer("intel");
        computer.setInventory(4,"A+");
        computer.getDetails();
        computer.deliverComputer();

        System.out.println();
        System.out.println();

        //after

        ComputerI computer1 = new ComputerI("3ds",5,"A+");
        InformationManager im = new InformationManager();
        im.getInformation(computer1);
        DeliveryManager dm = new DeliveryManager();
        dm.getDetails(computer1);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        /* Open Close principle */  /* ( salary calculation for employees) */
        //before

        CalculateSalary calculateSalary = new CalculateSalary("sam","Montly");
        Payroll pl = new Payroll();
        pl.payRollcal(calculateSalary);

        System.out.println();
        System.out.println();

        //after

        CalculateSalary1 person = new CalculateSalary1("sam","Montly");
        Montlypayroll montlypay = new Montlypayroll();
        montlypay.payRollcal(person);
        CommisionPayroll commisionPayroll = new CommisionPayroll();
        commisionPayroll.payRollcal((person));
        HourlyPayroll hourlyPayroll = new HourlyPayroll();
        hourlyPayroll.payRollcal(person);

        /* Liskov substitution principle */ /* (Website selection) */

        //before

        AmazonCustomer amazonCustomer = new AmazonCustomer();
        amazonCustomer.addtoAmazoncart();
        amazonCustomer.seeProducts();
        AlibabaCustomer alibabaCustomer = new AlibabaCustomer();
        alibabaCustomer.seeProducts();
        alibabaCustomer.addtoAmazoncart();

        System.out.println();
        System.out.println();

        //After

        AmazonCustomer1 amazonCustomer1 = new AmazonCustomer1();
        amazonCustomer1.addtoAmazoncart();
        amazonCustomer.seeProducts();
        AlibabaCustomer1 alibabaCustomer1 = new AlibabaCustomer1();
        alibabaCustomer1.seeProducts();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        /* InterfaceSegregation */ /* (Shopping experience) */

        //before

        Iphone apple = new Iphone();
        apple.bluetooth();
        apple.fullscreen();
        apple.touchid();
        Samsung samsung = new Samsung();
        samsung.bluetooth();
        samsung.fullscreen();
        samsung.touchid();

        System.out.println();
        System.out.println();

        //after

        Iphone1 apple1 = new Iphone1();
        apple1.bluetooth();
        apple1.fullscreen();
        Samsung1 samsung1 = new Samsung1();
        samsung1.fingerprint();
        samsung1.bluetooth();
        samsung1.fullscreen();


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        /* DependencyInversion */ /* (payment system) */

        //before

        PaymentSystem broker=new PaymentSystem();
        broker.doGooglePay("1234", 5000);
        broker.doPhonePay("2345", 2000);

        System.out.println();
        System.out.println();

        //after

        payment vendort;
        vendort=new payment(new GooglePay1("1234", 5000));
        vendort.pay();
        vendort=new payment(new PhonePay1("5678", 10000));
        vendort.pay();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



    }
}
