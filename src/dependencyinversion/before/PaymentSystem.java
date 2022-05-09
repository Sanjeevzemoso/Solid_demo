package dependencyinversion.before;

public class PaymentSystem {

        private GooglePay googlepay;
        private PhonePay phonepe;
        public void doGooglePay(String id,int amt) {
            googlepay=new GooglePay(id, amt);
            googlepay.sendMoney();
        }
        public void doPhonePay(String id,int amt) {
            phonepe=new PhonePay(id, amt);
            phonepe.sendMoney();
        }

}

