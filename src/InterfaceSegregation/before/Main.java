package InterfaceSegregation.before;

public class Main {
    public static void main(String[] args) {
        iphone appl = new iphone();
        appl.bluetooth();
        appl.fullscreen();
        appl.touchid();
        samsung smg = new samsung();
        smg.bluetooth();
        smg.fullscreen();
        smg.touchid();
    }
}
