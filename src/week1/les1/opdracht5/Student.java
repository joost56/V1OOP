package week1.les1.opdracht5;

public class Student {
    private String naam;
    private Integer studentnummer;


    public Student(String nm) {
        naam = nm;
        studentnummer = 0;
    }

    public Student(String nm, int stNr) {
        naam = nm;
        studentnummer = stNr;
    }

    public String getNaam() {
        return naam;
    }

    public Integer getStudentNummer() {
        return studentnummer;
    }

    public void setStudentNummer(Integer nwsn) {
        studentnummer = nwsn;

    }
    public String toString(){
        String s = "Deze student heet " + naam + " en heeft nummer: " + studentnummer;
        return s;

    }




}
