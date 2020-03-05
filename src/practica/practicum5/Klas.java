package practica.practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen;

    public Klas(String kC){
        klasCode = kC;
        deLeerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling L){
        deLeerlingen.add(L);
    }
    public void wijzigCijfer(String nm, double nweCijfer){
        for(Leerling leerling : deLeerlingen){
            if (leerling.getNaam().equals(nm)){
                leerling.setCijfer(nweCijfer);
            }
        }
    }
    public ArrayList<Leerling> getLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen() {
        return deLeerlingen.size();
    }

    public String toString(){
        String k = "In klas " + klasCode + " zitten de volgende leerlingen: \n";
            for (Leerling leerling : deLeerlingen){
                k = k + leerling + "\n";
            }
            return k;
    }
}
