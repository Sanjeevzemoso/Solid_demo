package Liskov.after;

public class alibabacustomer implements websitepage{

    @Override
    public void seeproducts() {
        System.out.println("Seeing products from GUEST account");
    }
}
