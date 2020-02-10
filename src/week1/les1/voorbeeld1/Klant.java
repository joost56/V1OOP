package week1.les1.voorbeeld1;

public class Klant {
    //attributen
    private String naam;
    private String adres;
    private String plaats;

    //constructor
    public Klant(String nm, String adr, String pl) {
        naam = nm;
        adres = adr;
        plaats = pl;

    }

    //getters: methoden om waarden van attributen op te vragen
    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public String getPlaats(){
        return plaats;
    }

    //setters: verandert de waarde van een attribuut
    public void setNaam(String nm) {
        naam = nm;
    }

    public void setAdres(String adr) {
        adres = adr;
    }

    public void setPlaats(String pl) {
        plaats = pl;
    }


    //toString methode
    public String toString(){
        String s = naam + " woont in " + adres + " in " + plaats;
        return s;
    }
}
