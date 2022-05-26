package liskov.after;


public class Main {
    public static void main(String[] args) {
        AmazonCustomer1 amzc = new AmazonCustomer1();
        amzc.addtoAmazoncart();
        amzc.seeProducts();
        AlibabaCustomer1 albc = new AlibabaCustomer1();
        albc.seeProducts();
    }
}
