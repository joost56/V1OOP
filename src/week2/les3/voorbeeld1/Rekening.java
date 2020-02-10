package week2.les3.voorbeeld1;

public class Rekening {
    private int nummer;
    private double saldo;


    public Rekening(int nummer) {
        this.nummer = nummer;
        this.saldo = 0.0;
    }

    public int getNummer() {
        return nummer;
    }

    public double getSaldo() {
        return saldo;
    }
    public void stort(double bedrag) {
        if (bedrag > 0) {
            saldo += bedrag;
        }
    }
    public void neemOp(double bedrag) {
        saldo -= bedrag;
    }
    public String toString() {
        String s = "Op rekening " + nummer + "staat" + saldo;
        return s;
    }
}
