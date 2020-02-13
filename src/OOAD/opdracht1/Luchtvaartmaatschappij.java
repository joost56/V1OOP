package OOAD.opdracht1;

import java.util.ArrayList;

public class Luchtvaartmaatschappij {
    private String Naam;
    private ArrayList<Vliegtuig> vliegtuigenList;


    public Luchtvaartmaatschappij(String naam) {
        this.Naam = naam;
    }

    public void addVliegtuig(Vliegtuig vt) {
        vliegtuigenList.add(vt);
    }

    public ArrayList<Vliegtuig> geefVliegtuigenList() {
        return vliegtuigenList;
    }


}
