package week2.les4.Voorbeeld2;

public class Rekening {
    private int nummer;
    private double saldo;

    public Rekening(int nummer) {
        this.nummer = nummer;
    }

    public int getNummer() {
        return nummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void stort (double bedrag) {
        saldo = saldo + bedrag;
    }
    public void neemOp (double bedrag) {
        saldo = saldo - bedrag;
    }
    public String toString() {
        return "Op rekening " + nummer + " staat " + saldo;
    }

}
