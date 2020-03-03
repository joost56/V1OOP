package week4.les7.voorbeeld1;

public class Main1 {
    public static void main(String[] args) {
        //aanmaken van een object van het type MockAutoService
        AutoService srv = new MockAutoService();
        VoorraadGUI gui = new VoorraadGUI(srv);
        gui.addAuto(new Auto("Volkswagen", "Kever", 1960));
        gui.showVoorraad();
    }
}
