package practica.practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant (String nm){
        naam = nm;
    }

    public double getKorting(){
        return kortingsPercentage;
    }

    public void setKorting(double kP) {
        kortingsPercentage = kP;
    }

    public String toString(){
        return naam + " (korting: " + kortingsPercentage + "%)";

    }
}

