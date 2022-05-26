package liskov.before;

public class Main {
    public static void main(String[] args) {
        AmazonCustomer amzc = new AmazonCustomer();
        amzc.addtoAmazoncart();
        amzc.seeProducts();
        AlibabaCustomer albc = new AlibabaCustomer();
        albc.seeProducts();
        albc.addtoAmazoncart();
    }
}
