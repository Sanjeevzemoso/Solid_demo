package Interfacesegregation.before;

public class Samsung implements Mobile{
    @Override
    public void bluetooth() {
        System.out.println("Samsung1 has 5.3 Bluetooth1");
    }

    @Override
    public void fullscreen() {
        System.out.println("Samsung1 has Fullscreen");
    }

    @Override
    public void touchid() {
        System.out.println("Samsung1 has touch id on screen");
    }
}
