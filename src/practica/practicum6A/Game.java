package practica.practicum6A;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }

    public double getNieuwprijs() {
        return nieuwprijs;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        int Jaar = LocalDate.now().getYear();
        while (Jaar != releaseJaar) {
            releaseJaar++;
            nieuwprijs = nieuwprijs * 0.70;
        }
        return nieuwprijs;
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;
        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;
            if (naam.equals(andereGame.naam) &&
                    releaseJaar == andereGame.releaseJaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
        public String toString() {
            String s = naam + " , uitgegeven in " + releaseJaar + "; nieuwprijs: €" + nieuwprijs + "nu voor: " + huidigeWaarde();
            return s;
        }

    }
