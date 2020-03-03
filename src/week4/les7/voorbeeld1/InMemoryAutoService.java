package week4.les7.voorbeeld1;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;

public class InMemoryAutoService implements AutoService{
    //attribuut voor de meervoudige associatie
    ArrayList<Auto>alleAutos;

    public InMemoryAutoService(){
        alleAutos = new ArrayList<Auto>();
    }

    public void voegAutoToe(Auto auto){
        if (auto == null) {
            throw new IllegalArgumentException("Auto mag niet null zijn");
        }
        //voor goede werking heeft klasse Auto de methode Equals nodig
        if(!alleAutos.contains(auto)){
            alleAutos.add(auto);
        }
    }

    public ArrayList<Auto> getAutos(){
        return alleAutos;
    }
}
