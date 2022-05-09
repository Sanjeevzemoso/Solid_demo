package InterfaceSegregation.before;

public class iphone implements Mobile{
    @Override
    public void bluetooth() {
        System.out.println("Iphone has 5.1 buletooth");
    }

    @Override
    public void fullscreen() {
        System.out.println("Iphone has fulscreen");
    }



    @Override
    public void touchid() {
        System.out.println("Iphone stopped support for touchid");
    }
}
