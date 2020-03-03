package week2.les4.Voorbeeld2;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;
    private Rekening mijnRekening;

    public Klant(String naam, String adres, String plaats) {
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
    }

    public String getAdres() {
        return adres;
    }

    public String getNaam() {
        return naam;
    }

    public String getPlaats() {
        return plaats;
    }

    public Rekening getMijnRekening() {
        return mijnRekening;
    }

    public void setMijnRekening(Rekening r) {
        mijnRekening = r;
    }

    public String toString() {
        String s = naam + " woont op " + adres + ", in " + plaats;
        if (mijnRekening == null) {
            s = s + "; Er is nog geen rekening bekend";
        }
        else {
            s = s + ";\n" + mijnRekening;
        }
        return s;
    }
}
