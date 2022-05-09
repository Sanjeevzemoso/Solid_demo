package dependencyinversion.before;

public class Main {
    public static void main(String[] args) {
        PaymentSystem broker=new PaymentSystem();
        broker.doGooglePay("1234", 5000);
        broker.doPhonePay("2345", 2000);
    }
}
