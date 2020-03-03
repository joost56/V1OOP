package week3.les5.voorbeeld3;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;

    public Huisdier(String naam, String ras) {
        this.naam = naam;
        this.ras = ras;
    }

    public String getNaam() {
        return naam;
    }

    public String getRas() {
        return ras;
    }

    public String toString(){
        String s = naam + ", de " + ras + ", weegt " + gewicht + ".";
        return s;
    }
}
