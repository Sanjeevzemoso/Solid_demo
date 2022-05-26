package liskov.after;

public class AlibabaCustomer1 implements WebsitePage {

    @Override
    public void seeProducts() {
        System.out.println("Seeing products from GUEST account");
    }
}
