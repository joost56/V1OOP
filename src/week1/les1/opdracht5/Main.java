package week1.les1.opdracht5;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Sylvester");
        Student st2 = new Student("Karel", 98765432);
        st1.setStudentNummer(12345678);
        System.out.println("naam: " + st1.getNaam());
        System.out.println("nummer: " + st1.getStudentNummer() );
        System.out.println("toString: " + st1.toString() + "\n");

        System.out.println("naam: " + st2.getNaam());
        System.out.println("nummer: " + st2.getStudentNummer());
        System.out.println("toString: " + st2.toString() + "\n");



    }
}

