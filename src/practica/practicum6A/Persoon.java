package practica.practicum6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijngames;

    public Persoon(String nm, double bud){
        naam = nm;
        budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        return false;
    }

    public boolean verkoop(Game g, Persoon koper){
        return true;
    }

    public String toString(){
        String s = naam + " heeft een budget van € " + budget + "en bezit de volgende games:" + mijngames;
        return s;
    }


}
