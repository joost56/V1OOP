package week4.les8.voorbeeld1;

public class Eend extends Dier {
    private boolean kanVliegen;

    public Eend(){
        super(2);
        kanVliegen = false;
    }

    public void setKanVliegen(boolean kV){
        kanVliegen = kV;
    }

    public String speak(){
        return "kwaak kwaak kwaak";
    }

    public String toString(){
//        String alDanNiet;
//        if(kanVliegen) {
//            alDanNiet = "wel";
//        } else{
//            alDanNiet = "niet";
//        }
        String alDanNiet = (kanVliegen ? "wel" : "niet");
        return "Eend met " + super.toString() + " kan " + alDanNiet + " vliegen";
    }

}
