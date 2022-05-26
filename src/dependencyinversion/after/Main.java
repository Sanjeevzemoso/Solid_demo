package dependencyinversion.after;

public class Main {
    public static void main(String[] args) {
        payment vendort;
        vendort=new payment(new GooglePay1("1234", 5000));
        vendort.pay();
        vendort=new payment(new PhonePay1("5678", 10000));
        vendort.pay();
    }
}
