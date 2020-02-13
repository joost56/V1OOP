package week2.les4.Voorbeeld1;

public class Rekening {
    private int nummer;
    private double saldo;
    //1. extra attribuut van de klasse klant met de rolnaam uit het UML
    private Klant rekeninghouder;

    public Rekening(int nummer) {
        this.nummer = nummer;
    }

    public int getNummer() {
        return nummer;
    }

    public double getSaldo() {
        return saldo;
    }
    //2. extra getter om Klant-object op te vragen
    public Klant getRekeninghouder() {
        return rekeninghouder;
    }

    //3. extra setter om Klant-object aan Rekening-object te koppelen
    public void setRekeninghouder(Klant klant) {
        rekeninghouder = klant;
    }

    public void stort(double bedrag) {
        saldo = saldo + bedrag;
    }

    public void neemOp(double bedrag) {
        saldo = saldo - bedrag;
    }

    //4. Uitbreiden toString methode met check of er een Klant-object is gekoppeld
    public String toString(){
        String s = "Op rekening " + nummer + " staat " + saldo;
        //4a. er is nog geen Klant-object gekoppeld
        if (rekeninghouder == null) {
            s = s + " en de rekeninghouder is onbekend";
        }
        //4b. Er is wel een klant-object gekoppeld
        else {
            s = s + " en de rekeninghouder is: " + rekeninghouder;
        }
        return s;
    }
}
