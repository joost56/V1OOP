package week4.les8.voorbeeld1;

public class Koe extends Dier {
    private double litersMelk;

    public Koe() {
        super(4);
        litersMelk = 0.0;
    }

    public void setLitersMelk(double lM){
        litersMelk = lM;
    }

    public String speak(){
        return "boeh";
    }

    public String toString(){
        return "Koe met "+ super.toString() + " geeft " + litersMelk + " liters melk.";
    }
}
