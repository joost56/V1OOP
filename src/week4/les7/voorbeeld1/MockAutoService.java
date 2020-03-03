package week4.les7.voorbeeld1;

import java.util.ArrayList;

public class MockAutoService implements AutoService{
    public void voegAutoToe(Auto auto) {
        System.out.println("Methode voeg auto toe");
    }

    public ArrayList<Auto> getAutos() {
        ArrayList<Auto> autos = new ArrayList<Auto>();
        autos.add(new Auto("Mercedes", "SLK 230", 2008));
        autos.add(new Auto("Suzuki", "Swift", 2007 ));
        return autos;
    }
}
