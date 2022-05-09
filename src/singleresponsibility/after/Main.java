package singleresponsibility.after;

import singleresponsibility.before.computer;

public class Main {
    public static void main(String[] args) {

        ComputerI cm = new ComputerI("3ds",5,"A+");
        Informationmanager im = new Informationmanager();
        im.getinformation(cm);
        Deliverymanager dm = new Deliverymanager();
        dm.getdetails(cm);





    }
}
