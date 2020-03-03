package week4.les7.voorbeeld3;

public class Main {
    public static void main(String[] args) {
        Dier dier = new Dier();
        Koe koe = new Koe();
        Eend eend = new Eend();

        System.out.println("Een dier zegt: " + dier.speak());
        System.out.println("Een koe zegt: " + koe.speak());
        System.out.println("Een eend zegt: " + eend.speak());
        System.out.println();

        System.out.println(dier);
        System.out.println(koe);
        System.out.println(eend);
    }
}
