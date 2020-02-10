package week2.les3.voorbeeld4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("peter", "peter.hu.nl");
        System.out.println(student);
        String email = student.getEmail();
        System.out.println(email);
        try {
            student.wijzigEmail(email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
