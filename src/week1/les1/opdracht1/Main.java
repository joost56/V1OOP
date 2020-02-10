package week1.les1.opdracht1;

public class Main {
    public static void main(String[] args) {
        //Strings uitprinten
        System.out.println("Hello World");
        System.out.println("Joost Buiting");
        String plaats = "Soest";
        System.out.println(plaats);

        //chars
        System.out.println('a');
        char b = 'b';
        System.out.println(b);

        //gehele getallen
        int getal1 = 45;
        int getal2 = 30;
        System.out.println(getal1 + getal2);
        System.out.println("De som is " + (getal1 + getal2));

        //gebroken getallen
        double getal3 = 1.3;
        double getal4 = 2.5;
        System.out.println("de deling is " + getal3/getal4 );

        // if-else statement
        if (getal1 % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("Het getal is oneven");
        }

        //for-statement
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        //while
        int j = 1;
        while (j<=10) {
            System.out.println(j);
            j++;
        }

        int z = 1;
        while (z<=10) {
            if (z % 2 == 0) {
                System.out.println("Het getal " + z +  " is even");
            }
            else {
                System.out.println("Het getal " + z +  " is oneven");
            }
            z++;

        }


    }
}
