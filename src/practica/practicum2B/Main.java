package practica.practicum2B;

public class Main {
    public static void main(String[] args) {
        Voetbalclub ajx = new Voetbalclub("Ajax", 0, 0, 0, 0, 0);
        Voetbalclub feij = new Voetbalclub("Feijenoord", 0, 0, 0, 0, 0);

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');
        ajx.verwerkResultaat('w');
        ajx.verwerkResultaat('w');
        ajx.verwerkResultaat('w');
        ajx.verwerkResultaat('w');

        System.out.println("Feijenoord punten: " + feij.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();

        System.out.println(ajx);
        System.out.println(feij);
    }
}
