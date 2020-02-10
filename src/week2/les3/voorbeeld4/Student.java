package week2.les3.voorbeeld4;

public class Student {
    private String naam;
    private String email;

    public Student(String naam, String email) {
        this.naam = naam;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void wijzigEmail(String em) throws Exception{
        if (!em.contains("@")) {
            throw new Exception("@ ontbreekt");
        }
        //else ontbreekt
    }
}
