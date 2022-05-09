package InterfaceSegregation.after;

public class iphone implements bluetooth,fullscreen{
    @Override
    public void bluetooth() {
        System.out.println("iphone has 5.1 bluetooth");
    }

    @Override
    public void fullscreen() {
        System.out.println("iphone has fullscreen");
    }
}
