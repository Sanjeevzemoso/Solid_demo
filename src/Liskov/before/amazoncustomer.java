package Liskov.before;

public class amazoncustomer extends amazonpage {


    @Override
    public void seeproducts() {
        System.out.println("Seeing amazon products using E345 amazon id ");
    }

    @Override
    public void addtoamazoncart() {
        System.out.println("Adding to E345 Cart");

    }
}
