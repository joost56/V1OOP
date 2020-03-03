package week3.les6.voorbeeld3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Klant> klantenlijst = new ArrayList<Klant>();
        Klant klant1 = new Klant("Jan", "Nijenoord 1", 55);
        Klant klant2 = new Klant("Jan", "Nijenoord 1", 55);

        klantenlijst.add(klant1);

        if (klantenlijst.contains(klant2)) {
            System.out.println("Klant 2 komt al voor in de lijst");
        }else {
            klantenlijst.add(klant2);
        }

        for (Klant klant: klantenlijst) {
            System.out.println(klant);
        }
        System.out.println();

        Klant klant3 = new Klant("Jan", "Nijenoord 1", 55);
        System.out.println("Index van klant 3: " + klantenlijst.indexOf(klant3));
        System.out.println("Verwijderen van klant 3 gelukt: " + klantenlijst.remove(klant3));

        for (Klant klant: klantenlijst) {
            System.out.println(klant);
        }
        System.out.println();

    }
}
