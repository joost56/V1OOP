package practica.practicum4B;

public class Autohuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public Autohuur(){
        aantalDagen = 0;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setGehuurdeAuto(Auto gA){
        gehuurdeAuto = gA;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setHuurder(Klant k){
        huurder = k;
    }

    public double totaalPrijs(){
        if (getHuurder() == null) {
            return 0.0;
        }
        double prijs = ((100-huurder.getKorting())/100)*(gehuurdeAuto.getPrijsPerdDag()*aantalDagen);
        return prijs;


    }

    public String toString(){
        String s = "";
        if (gehuurdeAuto == null && huurder == null ) {
            s = s + "  er is geen auto bekend\n  er is geen huurder bekend\n  aantal dagen: " + aantalDagen + " en dat kost 0.0";
        }
        else if (gehuurdeAuto == null) {
            s = s + "  er is geen auto bekend\n  op naam van: " + huurder + "\n  aantal dagen: " + aantalDagen + " en dat kost 0.0";
        }
        else if (huurder == null) {
            s = s + "  autotype: " + gehuurdeAuto + "\n  op naam van: er is geen huurder bekend" + aantalDagen + " en dat kost 0.0";
        }
        else {
            s = s + "  autotype: " + gehuurdeAuto + "\n  op naam van: " + huurder + "\n  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();

        }
        return s;

    }




}
