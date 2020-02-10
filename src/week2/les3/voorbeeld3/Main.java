package week2.les3.voorbeeld3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int getal1 = new Random().nextInt(5);
        int getal2 = new Random().nextInt(5);
        try {
            double uitkomst = getal1 / getal2;
            System.out.println(uitkomst);
        } catch (Exception e) {
            System.out.println("Fout opgetreden: " + e.getMessage());
        }
    }}

