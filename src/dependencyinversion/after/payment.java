package dependencyinversion.after;

public class payment {
    private vendor vendor;

    public payment(vendor vendor) {

        this.vendor = vendor;
    }
    public void pay() {
        vendor.pay();
    }
}
