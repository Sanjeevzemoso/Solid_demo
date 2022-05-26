package Interfacesegregation.after;

public class Main {
    public static void main(String[] args) {
            Iphone1 app = new Iphone1();
            app.bluetooth();
            app.fullscreen();
            Samsung1 smg = new Samsung1();
            smg.fingerprint();
            smg.bluetooth();
            smg.fullscreen();
    }
}
