package week4.les8.voorbeeld1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //referentietype: type in de declaratie
        //objecttype: type van het aangemaakte object

        //dynamische binding
        //1. het objecttype bepaald welke methode wordt uitgevoerd.
        //2. de compiler controleert of het referentietype de methode bevat
        //3. tijdens het runnen wordt de methode van het objecttype uitgevoerd.

        Dier dier1; // referentietype = Dier
        dier1 = new Koe();//objecttype is koe
        Dier dier2 = new Eend(); // referentietype is Dier en objecttype is Eend
        Dier dier3 = new Dier(); // referentietype is Dier en objecttype is Dier
        System.out.println(dier1.speak());//objecttype Koe => Boeh
        System.out.println(dier2.speak());//objecttype Eend=>kwaak kwaak kwaak
        System.out.println(dier3.speak());//objecttype Dier => *

        ArrayList<Dier> alleBeesten = new ArrayList<Dier>();//referentietype = Dier
        alleBeesten.add(new Koe()); //objecttype = Koe
        alleBeesten.add(new Eend()); // objecttype = Eend
        alleBeesten.add(new Dier()); // objecttype = Dier
        for (Dier dier : alleBeesten){
            System.out.println(dier.speak());
        }


    }
}
