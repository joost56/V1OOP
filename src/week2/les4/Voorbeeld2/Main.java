package week2.les4.Voorbeeld2;

public class Main {
    public static void main(String[] args) {
        Klant k1 = new Klant("Jan", "Nijenoord 1", "Utrecht");
        Klant k2 = new Klant("Wim", "Oudenoord 340", "Utrecht");
        System.out.println(k1);
        System.out.println(k2);
        System.out.println();

        Rekening r1 = new Rekening(12345678);
        Rekening r2 = new Rekening(98765432);

        k1.setMijnRekening(r1);
        k2.setMijnRekening(r2);

        r1.stort(1000);
        r2.stort(1503);

        System.out.println(k1);
        System.out.println(k1.getMijnRekening());
        System.out.println();
        System.out.println(k2);
        System.out.println(k2.getMijnRekening());
    }


}
