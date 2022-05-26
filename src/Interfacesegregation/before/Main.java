package Interfacesegregation.before;

public class Main {
    public static void main(String[] args) {
        Iphone appl = new Iphone();
        appl.bluetooth();
        appl.fullscreen();
        appl.touchid();
        Samsung smg = new Samsung();
        smg.bluetooth();
        smg.fullscreen();
        smg.touchid();
    }
}
