package OOAD.opdracht1;

public class Main {
    public static void main(String[] args) {
        Luchtvaartmaatschappij klm = new Luchtvaartmaatschappij("KLM");
        Vliegtuig Boeing = new Vliegtuig();
        Boeing.setNaam("Boeing 737");
        Vliegtuig airbus = new Vliegtuig();
        airbus.setNaam("Airbus a380");
        klm.addVliegtuig(Boeing);
        klm.addVliegtuig(airbus);
        for (Vliegtuig vliegtuig: klm.geefVliegtuigenList()){
            System.out.println(vliegtuig.getNaam());
        }
    }
}
