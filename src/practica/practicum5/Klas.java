package practica.practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    public Klas(String kC){
        klasCode = kC;
        leerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling L){
        leerlingen.add(L);
    }
    public void wijzigCijfer(String nm, double nweCijfer){
        for(Leerling leerling : leerlingen){
            if (leerling.getNaam().equals(nm)){
                leerling.setCijfer(nweCijfer);
            }
        }
    }
    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen() {
        return leerlingen.size();
    }

    public String toString(){
        String k = "In klas " + klasCode + " zitten de volgende leerlingen: \n";
            for (Leerling leerling : leerlingen){
                k = k + leerling + "\n";
            }
            return k;
    }
}
