package liskov.after;

public class AmazonCustomer1 extends AmazonPage1 implements WebsitePage {
    @Override
    public void addtoAmazoncart() {
        System.out.println("eeing amazon products using E345 amazon id");
    }

    @Override
    public void seeProducts() {
        System.out.println("Adding to E345 Cart");
    }
}
