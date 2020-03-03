package week3.les6.voorbeeld3;

public class Klant {
    private String naam;
    private String adres;
    private int leeftijd;

    public Klant(String naam, String adres, int leeftijd) {
        this.naam = naam;
        this.adres = adres;
        this.leeftijd = leeftijd;
    }

    public boolean equals(Object andereObject){
        //defineer een boolean met de beginwaarde false
        boolean gelijkeObjecten = false;
        //controleer of de parameter van het type van de klasse is
        if(andereObject instanceof Klant){
            //maake een nieuwe variabele aan van de klasse en cast het andereObject
            Klant andereKlant = (Klant)andereObject;
            //alle atributen vergelijken, == voor primitves en equals voor objecten
            if(this.naam.equals(andereKlant.naam) &&
                this.adres.equals(andereKlant.adres)&&
                this.leeftijd == andereKlant.leeftijd){
                    gelijkeObjecten = true;
            }

        }
        //geef de waarde van gelijke objecten terug
        return gelijkeObjecten;
    }


    public String toString(){
        String s = naam + ", " + adres + ", " + leeftijd;
        return s;
    }
}
