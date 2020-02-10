package week1.les2.voorbeeld1;

public class Rekening {
    private int nummer;
    private double saldo;

    public Rekening(int nr ){
        nummer = nr;
        saldo = 0.0;
    }

    public int getNummer() {
        return nummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void stort(double bedrag) {
        saldo = saldo + bedrag;
    }

    public void neemOp(double bedrag){
        saldo = saldo -bedrag;
    }

    public String toString(){
        String s = "Het nummer is " + nummer + " en het saldo bedraagt "+ saldo;
        return s;
    }

}
