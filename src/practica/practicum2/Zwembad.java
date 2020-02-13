package practica.practicum2;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;
    private double berekende_inhoud;

    public Zwembad() {
        breedte = 0.0;
        lengte = 0.0;
        diepte = 0.0;
        berekende_inhoud = 0.0;

    }
    public Zwembad(double br, double le, double di) {
        breedte = br;
        lengte = le;
        diepte = di;
        berekende_inhoud = 0.0;

    }

    public Zwembad(double br, double le, double di, double bi) {
        breedte = br;
        lengte = le;
        diepte = di;
        berekende_inhoud = bi;

    }

    public double getBreedte() {
        return breedte;
    }
    public double getLengte() {
        return lengte;
    }
    public double getDiepte() {
        return diepte;
    }
    public double getInhoud() {
        return this.breedte * this.lengte * this.diepte;
    }



    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }
    public void setLengte(double lengte) {
        this.lengte = lengte;
    }
    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }
    public void setInhoud(double berekende_inhoud) {
        this.berekende_inhoud = berekende_inhoud;
    }
    public String toString() {
        String s = "GEGEVENS ZWEMBAD: Dit zwembad is "+ breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
        return s;
    }



}

