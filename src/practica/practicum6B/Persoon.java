package practica.practicum6B;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijngames;

    public Persoon(String nm, double bud){
        naam = nm;
        budget = bud;
        mijngames = new ArrayList<Game>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if(getBudget() >= g.huidigeWaarde() && !mijngames.contains(g)){
            mijngames.add(g);
            budget = budget - g.huidigeWaarde();
            return true;
        }else{
            return false;
        }
    }

    public Game zoekGameOpNaam(String naam) {
        for (Game game : mijngames) {
            if (game.getNaam().equals(naam)) {
                return game;
            }
        }
        return null;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if(koper.budget >= g.huidigeWaarde() && !g.equals(g.getNaam())){
            mijngames.remove(g);
            budget = budget + g.huidigeWaarde();
            koper.koop(g);
            return true;
        }else{
            return false;
        }
    }


    public String toString(){
        String s = naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games: \n";
        for (Game game : mijngames){
            s = s + game + "\n";
        }
        return s;
    }


}
