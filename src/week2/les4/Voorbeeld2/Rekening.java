package week2.les4.Voorbeeld2;

public class Rekening {
    private int nummer;
    private double saldo;

    public Rekening(int nummer) {
        this.nummer = nummer;
    }

    public void stort (double bedrag) {
        saldo = saldo + bedrag;
    }
    public void neemOp (double bedrag) {
        saldo = saldo - bedrag;
    }

}
