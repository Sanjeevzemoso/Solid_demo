package liskov.before;

public class AlibabaCustomer extends AmazonPage {
    @Override
    public void seeProducts() {
        System.out.println("Seeing amazon products using GUEST id");
    }

    @Override
    public void addtoAmazoncart() {
        System.out.println("No information");
    }
}
