package week3.les6.voorbeeld2;

public class Main {
    public static void main(String[] args) {
        //conversie van getallen naar strings
        String woord = "woord";
        int getal = 123;
        System.out.println(woord + getal);
        System.out.println(getal + woord);

        System.out.println(1+2+"3"+4+5);

        //conversie van string naar integer
        String stringGetal1 = "56";
        int getal1 = Integer.parseInt(stringGetal1);

        //conversie van string naar double
        String stringGetal2 = "45.67";
        double getal2 = Double.parseDouble(stringGetal2);
    }
}
