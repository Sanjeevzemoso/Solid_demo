package singleresponsibility.before;

import java.time.LocalDate;
import java.util.List;

public class computer {
    private String productId;
    private int power;
    private String class1;
    private double ram;



    computer( String id) {
        this.productId = id;

    }

    public void getDetails() {
        //using the database get  options for ram of the product
        System.out.println("The product id is " +this.productId);
        System.out.println("The power capacity is "+this.power);
        System.out.println("Its class is "+this.class1);
        System.out.println("The ram capacity is "+this.ram);


    }

    public void deliverComputer(){
        System.out.println("The computer will be delivered on");
        LocalDate datedlvr = LocalDate.now().plusDays(30);
        System.out.println(datedlvr);



    }

    public void setInventory(int power,String class1){
        this.power = power;
        this.class1 = class1;
        this.ram = power*1024;



    }
}
