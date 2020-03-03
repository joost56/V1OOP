package practica.practicum4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr){
        adres = adr;
        bouwjaar = bwjr;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public void setHuisbaas(Persoon hb){
        huisbaas = hb;
    }

    public String toString() {
        String s = "Huis " + adres + " is gebouwd in " + bouwjaar + "\n";
        if (huisbaas == null) {
            s = s + "en de huisbaas is nog onbekend";
        } else {
            s = s + "en heeft huisbaas " + huisbaas;
        }
        return s;
    }
}
