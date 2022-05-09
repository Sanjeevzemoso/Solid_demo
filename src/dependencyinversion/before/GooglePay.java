package dependencyinversion.before;

public class GooglePay {

        private String id;
        int amt;
        public GooglePay(String id, int amt) {
            this.id = id;
            this.amt = amt;
        }
        public void sendMoney() {
            System.out.println("Money transferred using GooglePay to "+id+", "+"Amount Transferred is "+amt);
        }


}
