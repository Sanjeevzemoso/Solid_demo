package dependencyinversion.after;

public class Main {
    public static void main(String[] args) {
        payment vendort;
        vendort=new payment(new GooglePay("1234", 5000));
        vendort.pay();
        vendort=new payment(new PhonePay("5678", 10000));
        vendort.pay();
    }
}
