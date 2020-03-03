package week3.les5.voorbeeld4;

import java.util.ArrayList;

public class Winkel {
    private String naam;
    //1. toevoegen van attribuut klanten van het type Arraylist Klant
    private ArrayList<Klant> klanten;

    public Winkel(String naam) {
        this.naam = naam;
        //2. initialiseer de Arraylist
        this.klanten = new ArrayList<Klant>();
    }

    //3. getter toevoegen voor de klantenlijst
    public ArrayList<Klant> getKlanten() {
        return klanten;
    }
    //4. voeg toe methode om een klant toe te voegen
    //Let op: er is een check op dubbele klanten
    public void voegKlantToe(Klant klant){
        if(!klanten.contains(klant)) {
            klanten.add(klant);
        }
    }
    //5. verwijder klant methode toevoegen
    //heeft return type boolean!
    public boolean verwijderKlant(Klant klant) {
        return klanten.remove(klant);
    }
    //6. tostring methode uitbreiden
    public String toString(){
        String s = "De naam van de winkel is: " + naam;
        //6a. de winkel heeft geen klanten
        if (klanten.isEmpty()) {
            s += "en de winkel heeft geen klanten";
        }
        else{
            s+= "en de klanten zijn:\n";
            for (Klant klant: klanten) {
                s += klant + "\n";
            }
        }
        return s;
    }

}
