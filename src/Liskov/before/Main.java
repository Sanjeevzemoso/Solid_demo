package Liskov.before;

public class Main {
    public static void main(String[] args) {
        amazoncustomer amzc = new amazoncustomer();
        amzc.addtoamazoncart();
        amzc.seeproducts();
        alibabacustomer albc = new alibabacustomer();
        albc.seeproducts();
        albc.addtoamazoncart();
    }
}
