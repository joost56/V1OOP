package practica.practicum4B;

public class Auto {
    private String type;
    private double prijsPerdDag;

    public Auto(String tp, double prPd){
        type = tp;
        prijsPerdDag = prPd;
    }

    public double getPrijsPerdDag() {
        return prijsPerdDag;
    }

    public void setPrijsPerdDag(double prijsPerdDag) {
        this.prijsPerdDag = prijsPerdDag;
    }
    public String toString(){
        return type + " met prijs per dag: " + prijsPerdDag;
    }
}
