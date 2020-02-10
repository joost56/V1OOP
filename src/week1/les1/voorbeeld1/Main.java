package week1.les1.voorbeeld1;

public class Main {
    public static void main(String[] args) {
        Klant klant1 = new Klant("Joost", "Soest", "Utrecht");
        Klant klant2 = new Klant("Wim", "Oudenoord 340", "Utrecht");
        //System.out.println(klant1.naam); werkt niet, want naam is private
        //System.out.println(klant1); werkt niet goed, want klasse Klant heeft nog geen toString methode

        System.out.println(klant1.getNaam());
        System.out.println(klant2.getPlaats());
        //methode toString gemaakt
        System.out.println(klant1);

        klant1.setAdres("Vreeburg 38");
        klant2.setPlaats("Amsterdam");
        System.out.println(klant1);
        System.out.println(klant2);




    }
}
