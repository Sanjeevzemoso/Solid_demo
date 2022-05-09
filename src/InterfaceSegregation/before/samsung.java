package InterfaceSegregation.before;

public class samsung implements Mobile{
    @Override
    public void bluetooth() {
        System.out.println("samsung has 5.3 bluetooth");
    }

    @Override
    public void fullscreen() {
        System.out.println("samsung has fullscreen");
    }

    @Override
    public void touchid() {
        System.out.println("samsung has touch id on screen");
    }
}
