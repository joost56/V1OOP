package week3.les6.voorbeeld1;

public class Main {
    public static void main(String[] args) {
        char a = 'a';
        String woord = "pen";
        System.out.println(a+woord);
        System.out.println();

        //string-literals maken
        String s1 = "woord1";
        String s2 = "woord2";
        System.out.println(s1 + " " + s2);
        System.out.println("Lengte: " + s1.length());
        System.out.println("Karakter op een bepaalde index: " + s2.charAt(3));
        System.out.println("Strings vergelijken: " + s1.compareTo(s2));
        System.out.println("Strings vergelijken: " + s2.compareTo(s1));
        System.out.println("Strings vergelijken: " + "aap".compareTo("hond"));
        System.out.println("Strings vergelijken: " + "aap".compareTo("aap"));
        System.out.println("index van een bepaald karakter: " + s2.indexOf('d'));
        System.out.println(s1.toUpperCase());
        //strings zijn immutable
        System.out.println(s1);
        s1 = s1.toUpperCase();
        System.out.println(s1);

        //strings aanmaken met een constructor
        String s3 = new String("woord3");
        String s4 = new String("woord3");
        //vragen of adressen zijn gelijk
        System.out.println("s3 == s4: " + s3==s4);
        //inhoudelijk vergelijken
        System.out.println("s3.equals(s4) " + s3.equals(s4));

    }
}
