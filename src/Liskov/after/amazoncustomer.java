package Liskov.after;

public class amazoncustomer extends amazonpage implements websitepage{
    @Override
    public void addtoamazoncart() {
        System.out.println("eeing amazon products using E345 amazon id");
    }

    @Override
    public void seeproducts() {
        System.out.println("Adding to E345 Cart");
    }
}
