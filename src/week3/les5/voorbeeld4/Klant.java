package week3.les5.voorbeeld4;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;

    public Klant(String naam, String adres, String plaats) {
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;
        if (andereObject instanceof Klant) {
            Klant andereKlant = (Klant) andereObject;
            if (this.naam.equals(andereKlant.naam) &&
                    this.adres.equals(andereKlant.adres) &&
                    this.plaats.equals(andereKlant.plaats)) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
    public String toString(){
        String s = naam + " woont op " + adres + " in " + plaats;
        return s;

    }
}
