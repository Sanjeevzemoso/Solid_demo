package singleresponsibility.before;

import singleresponsibility.after.ComputerI;
import singleresponsibility.after.Informationmanager;

public class Main {
    public static void main(String[] args) {
        computer cm = new computer("intel");
        cm.setInventory(4,"A+");
        cm.getDetails();
        cm.deliverComputer();




    }
}
