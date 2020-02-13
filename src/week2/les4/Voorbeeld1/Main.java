package week2.les4.Voorbeeld1;

public class Main {
    public static void main(String[] args) {
        //aanmaken van twee Rekening-objecten
        Rekening rekening1 = new Rekening(12345678);
        Rekening rekening2 = new Rekening(98765432);
        rekening1.stort(150);
        rekening2.stort(300);
        System.out.println(rekening1);
        System.out.println(rekening2);

        //aanmaken van 2 Klant-objecten
        Klant klant1 = new Klant("Jan", "Nijenoord1", "Utrecht");
        Klant klant2 = new Klant("Wim", "Oudenoord", "Utrecht");

        //klant1 koppelen aan rekening1
        rekening1.setRekeninghouder(klant1);
        System.out.println(rekening1);
        //gegevens printen van de klant van rekening1
        System.out.println(rekening1.getRekeninghouder());
        //klant2 koppelen aan rekening2
        rekening2.setRekeninghouder(klant2);
        System.out.println(rekening2);
        //klant1 koppelen aan rekening2
        rekening2.setRekeninghouder(klant1);
        System.out.println(rekening1);
        System.out.println(rekening2);
    }
}
