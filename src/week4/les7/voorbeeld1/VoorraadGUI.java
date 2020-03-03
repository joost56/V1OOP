package week4.les7.voorbeeld1;

import java.util.ArrayList;

public class VoorraadGUI {
    //een attribuut declareren van het type van de interace
    //hierop kun je de methode van de interface aanroepen
    private AutoService service;

    //constructor maakt een nieuwe service aan
    public VoorraadGUI(AutoService srv){
        service = srv;
    }

    //methode om auto te laten zien
    public void showVoorraad(){
        ArrayList<Auto> autos = service.getAutos();
        for(Auto auto: autos){
            System.out.println(auto);
        }
    }

    // methode om auto toe te voegen
    public void addAuto(Auto auto){
        service.voegAutoToe(auto);
    }
}
