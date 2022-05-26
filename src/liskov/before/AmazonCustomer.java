package liskov.before;

public class AmazonCustomer extends AmazonPage {


    @Override
    public void seeProducts() {
        System.out.println("Seeing amazon products using E345 amazon id ");
    }

    @Override
    public void addtoAmazoncart() {
        System.out.println("Adding to E345 Cart");

    }
}
