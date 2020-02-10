package week1.les2.voorbeeld1;

public class Main {
    public static void main(String[] args) {
        Rekening rekening1 = new Rekening(123456789);
        Rekening rekening2 = new Rekening(987654321);
        Rekening rekening3 = new Rekening(132456789);
        rekening1.neemOp(45.88);
        rekening2.stort(250.0);
        rekening2.neemOp(210.0);
        rekening2.neemOp(50.0);
        rekening3.stort(567.00);

        System.out.println("Saldo van rekening 1: " + rekening1.getSaldo());
        System.out.println("Nummer van rekening 2: " + rekening2.getNummer());
        System.out.println(rekening3);

        Rekening rekening4 = null;
        //System.out.println(rekening4.toString());
        System.out.println(rekening4);
    }
}
