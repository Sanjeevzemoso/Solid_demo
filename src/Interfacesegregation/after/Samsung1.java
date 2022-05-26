package Interfacesegregation.after;

public class Samsung1 implements Bluetooth1, Fullscreen, FingerPrint {
    @Override
    public void bluetooth() {
        System.out.println("Samsung1 has 5.3 bluettoth");
    }

    @Override
    public void fingerprint() {
        System.out.println("Samsung1 has FingerPrint on screen");
    }

    @Override
    public void fullscreen() {
        System.out.println("Samsung1 has Fullscreen");
    }
}
