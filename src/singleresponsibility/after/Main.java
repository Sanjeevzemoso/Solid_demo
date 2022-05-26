package singleresponsibility.after;

public class Main {
    public static void main(String[] args) {

        ComputerI cm = new ComputerI("3ds",5,"A+");
        InformationManager im = new InformationManager();
        im.getInformation(cm);
        DeliveryManager dm = new DeliveryManager();
        dm.getDetails(cm);





    }
}
