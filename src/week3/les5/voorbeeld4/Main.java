package week3.les5.voorbeeld4;

public class Main {
    public static void main(String[] args) {
        Winkel winkel = new Winkel("JumboParkwijk");
        Klant klant1 = new Klant("Jan de Wit", "Straatweg 54", "Edam");
        Klant klant2 = new Klant("Kees de Bruin", "Lindelaan 12", "Edam");
        Klant klant3 = new Klant("Jan de Wit", "Straatweg 54", "Edam");

        System.out.println(winkel);
        winkel.voegKlantToe(klant1);
        winkel.voegKlantToe(klant2);
        winkel.voegKlantToe(klant3);

        System.out.println(winkel);
    }
}
