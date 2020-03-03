package week4.les7.voorbeeld1;

public class Main2 {
    public static void main(String[] args) {
        AutoService srv = new InMemoryAutoService();
        VoorraadGUI gui = new VoorraadGUI(srv);
        gui.addAuto(new Auto("Mercedes", "SlK", 2008));
        gui.showVoorraad();
    }
}
