package singleresponsibility.before;

public class Main {
    public static void main(String[] args) {
        Computer cm = new Computer("intel");
        cm.setInventory(4,"A+");
        cm.getDetails();
        cm.deliverComputer();




    }
}
