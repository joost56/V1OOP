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

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        int jaar = LocalDate.now().getYear() ;
        int Verschil_in_Jaren = jaar - releaseJaar;
        double Daling = (Math.pow(0.70, Verschil_in_Jaren));
        return Daling * nieuwprijs;

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
            String s = naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + String.format("%.2f", nieuwprijs) + " nu voor: €" + String.format("%.2f", huidigeWaarde());
            return s;
        }

    }
