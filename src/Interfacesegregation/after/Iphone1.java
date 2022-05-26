package Interfacesegregation.after;

public class Iphone1 implements Bluetooth1, Fullscreen {
    @Override
    public void bluetooth() {
        System.out.println("Iphone1 has 5.1 Bluetooth1");
    }

    @Override
    public void fullscreen() {
        System.out.println("Iphone1 has Fullscreen");
    }
}
