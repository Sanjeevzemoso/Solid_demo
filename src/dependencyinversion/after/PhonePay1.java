package dependencyinversion.after;

public class PhonePay1 implements vendor{
    private String id;
    private int amount;
    public PhonePay1(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }
    public void pay() {
        System.out.println("Money transferred using PhonePe to "+id+", "+"Amount Transferred is "+amount);
    }
}
