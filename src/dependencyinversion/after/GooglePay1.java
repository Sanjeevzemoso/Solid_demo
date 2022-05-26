package dependencyinversion.after;

public class GooglePay1 implements vendor{
    private String id;
    private int amount;
    public GooglePay1(String id, int amount) {
        this.id=id;
        this.amount=amount;
    }
    public void pay() {
        System.out.println("Money transferred using GooglePay1 to "+id+", "+"Amount Transferred is "+amount);
    }
}