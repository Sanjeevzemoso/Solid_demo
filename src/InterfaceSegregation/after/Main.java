package InterfaceSegregation.after;

public class Main {
    public static void main(String[] args) {
            iphone app = new iphone();
            app.bluetooth();
            app.fullscreen();
            samsung smg = new samsung();
            smg.fingerprint();
            smg.bluetooth();
            smg.fullscreen();
    }
}
