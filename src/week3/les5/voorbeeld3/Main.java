package week3.les5.voorbeeld3;

import java.util.ArrayList;

//opdracht 5.3 uit werkboek
public class Main {
    public static void main(String[] args) {
        //1. declareren en initialiseren van een huisdierenlijst
        ArrayList<Huisdier> huisdierenLijst = new ArrayList<Huisdier>();
        //declareren: Arraylist<Huisdier> = new ArrayList<Huisdier>();
        //huisdierenlijst = new ArrayList<Huisdier>();

        //2. Huisdier objecten aanmaken
        Huisdier huisdier1 = new Huisdier("Bello", "Bouvier");
        Huisdier huisdier2 = new Huisdier("Poekie", "Cyperse poes");

        //3. huisdieren toevoegen aan lijst
        huisdierenLijst.add(huisdier1);
        huisdierenLijst.add(huisdier2);

        //4. huisdier toevoegen in één regel
        huisdierenLijst.add(new Huisdier("zwartje", "Vlaamse reus"));

        //5. Toon aantal dieren van de list
        System.out.println("Het aantal dieren is: " + huisdierenLijst.size());

        //6. dieren uitprinten met een for-each loop
        for (Huisdier huisdier: huisdierenLijst) {
            System.out.println(huisdier);
        }
        System.out.println();

        //7. dier toevoegen aan het begin van de lijst
        huisdierenLijst.add(0, new Huisdier("Witje", "Siamees"));

        //8. huisdier op index 2 vervangen door een ander huisdier
        huisdierenLijst.set(2, new Huisdier("Bruno", "Duitse Herder"));

        //9. uitprinten met for-lus
        for (int i=0; i<huisdierenLijst.size(); i++) {
            System.out.println(huisdierenLijst.get(i));
        }

        //10. Bello verwijderen
        System.out.println(huisdierenLijst.remove(huisdier1));

        //11. huisdier met index1 verwijderen
        huisdierenLijst.remove(1);


        for (int i=0; i<huisdierenLijst.size(); i++) {
            System.out.println(huisdierenLijst.get(i));
        }
    }

}
