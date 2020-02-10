package practica.practicum2B;

public class Voetbalclub {
    private String naam;
    public int aantalGespeeld;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    public int aantalPunten;


    public Voetbalclub (String nm, int antlges, int antlgew, int antlgel, int antlver, int antlpt) {
        naam = nm;
        aantalGespeeld = antlges;
        aantalGewonnen = antlgew;
        aantalGelijk = antlgel;
        aantalVerloren = antlver;
        aantalPunten = antlpt;
    }

    public int aantalGespeeld() { return aantalGespeeld; }
    public int aantalPunten() {return aantalPunten;}
    

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen = aantalGewonnen + 1;
            aantalPunten = aantalPunten + 3;
            aantalGespeeld = aantalGespeeld + 1;
        }
        else if (ch == 'g') {
            aantalGelijk = aantalGelijk + 1;
            aantalPunten = aantalPunten + 1;
            aantalGespeeld = aantalGespeeld + 1;
        }
        else if (ch == 'v'){
            aantalVerloren = aantalVerloren + 1;
            aantalPunten = aantalPunten + 0;
            aantalGespeeld = aantalGespeeld + 1;
        }
        else {
            System.out.println("Foutmelding: Geef w voor winst, v voor verlies of g voor gelijkspel");
        }
    }
    public String toString() {
        String s = naam + ' ' + aantalGespeeld + ' ' + aantalGewonnen + ' ' + aantalGelijk + ' ' + aantalVerloren + ' ' + aantalPunten;
        return s;
    }
}