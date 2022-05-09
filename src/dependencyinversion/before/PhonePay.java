package dependencyinversion.before;

public class PhonePay {
    private String id;
    int amt;
    public PhonePay(String id, int amt) {
        this.id = id;
        this.amt = amt;
    }
    public void sendMoney() {
        System.out.println("Money transferred using PhonePe to "+id+", "+"Amount Transferred is "+amt);
    }
}

