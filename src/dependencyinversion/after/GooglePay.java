package dependencyinversion.after;

class GooglePay implements vendor{
    private String id;
    private int amount;
    public GooglePay(String id,int amount) {
        this.id=id;
        this.amount=amount;
    }
    public void pay() {
        System.out.println("Money transferred using GooglePay to "+id+", "+"Amount Transferred is "+amount);
    }
}