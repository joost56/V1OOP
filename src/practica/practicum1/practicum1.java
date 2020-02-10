package practica.practicum1;

import java.lang.Math;

public class practicum1 {
    public static void main(String[] args) {
        System.out.println("Opdracht 1: Getallenlijst: For");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n" + "Opdracht 2: Getallenlijst: While");
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        System.out.println("\n" + "Opdracht 3: Random getallen");
        for (double nummer = 0; nummer < 10; nummer++) {
            System.out.println(Math.random());
        }

        System.out.println("\n" + "Opdracht 4: Som van gehele getallen");
        int k = 0;
        int c = 0;
        while (c <= 39) {
            k = k + c;
            c = c + 1;
            System.out.println(k);
        }

        System.out.println("\n" + "Opdracht 5: Zaagtandpatroon");
        int i;
        for (i = 1; i <= 4; i++) {
            if (i % 2 == 0) {
                System.out.println("ss");
            } else {
                System.out.println("s");
            }
        }
        }
    }

