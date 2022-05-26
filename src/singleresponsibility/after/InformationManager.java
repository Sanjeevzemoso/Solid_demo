package singleresponsibility.after;

public class InformationManager {

    public void getInformation(ComputerI com) {
        System.out.println(com.productId);
        System.out.println(com.power);
        System.out.println(com.class1);
        System.out.println(com.ram);

    }

}