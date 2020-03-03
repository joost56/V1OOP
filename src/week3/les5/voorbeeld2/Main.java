package week3.les5.voorbeeld2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // een arraylist declareren met een willekeurig type
        ArrayList cijferlijst = new ArrayList();
        cijferlijst.add(6.9);
        cijferlijst.add(8.1);
        cijferlijst.add(6.2);

        //uitprinten: eerste poging
        System.out.println(cijferlijst);

        //items uitprinten met een for-Lus
        for(int i = 0; i<cijferlijst.size(); i++) {
            System.out.println(cijferlijst.get(i));
        }
        //items uitprinten met een for-each lus
        for (Object item: cijferlijst) {
            System.out.println(item);
        }
        cijferlijst.add("student");
        for(Object item: cijferlijst) {
            System.out.println(item);
        }


    }

}
