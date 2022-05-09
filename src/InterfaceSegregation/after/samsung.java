package InterfaceSegregation.after;

public class samsung implements bluetooth,fullscreen,fingerprint{
    @Override
    public void bluetooth() {
        System.out.println("samsung has 5.3 bluettoth");
    }

    @Override
    public void fingerprint() {
        System.out.println("samsung has fingerprint on screen");
    }

    @Override
    public void fullscreen() {
        System.out.println("samsung has fullscreen");
    }
}
