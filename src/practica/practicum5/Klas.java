package practica.practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private Leerling deLeerlingen;
    private ArrayList<Leerling> leerlingen;

    public Klas(String kC){
        klasCode = kC;
        leerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling L){
        leerlingen.add(L);
    }
    public void wijzigCijfer(String nm, double nweCijfer){

    }
    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen() {
        return leerlingen.size();
    }

    public String toString(){

        String s = "In klas " + klasCode + " zitten de volgende leerlingen: \n" + leerlingen.get(0) + "\n"+ leerlingen.get(1) + "\n" + leerlingen.get(2);


            return s;
    }
}
