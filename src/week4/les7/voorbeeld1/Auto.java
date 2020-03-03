package week4.les7.voorbeeld1;

public class Auto {
    private String merk;
    private String type;
    private int bouwjaar;

    public Auto(String merk, String type, int bouwjaar) {
        this.merk = merk;
        this.type = type;
        this.bouwjaar = bouwjaar;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "merk='" + merk + '\'' +
                ", type='" + type + '\'' +
                ", bouwjaar=" + bouwjaar +
                '}';
    }
}
