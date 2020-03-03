package week4.les7.voorbeeld3;

public class Dier {
    protected int aantalPoten;

    public Dier(){
        this(0);
    }

    public Dier (int aP){
        aantalPoten = aP;
    }

    public String speak(){
        return "*";
    }

    public String toString(){
        return "aantal poten: " + aantalPoten;
    }
}
