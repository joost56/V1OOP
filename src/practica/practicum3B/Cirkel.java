package practica.practicum3B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int xPositie, int yPositie) throws IllegalArgumentException{
        if (rad <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        radius = rad;
        this.xPositie = xPositie;
        this.yPositie = yPositie;
    }



    public String toString(){
        return "cirkel (" + xPositie + "," + yPositie + ") met radius: " + radius;
    }
}
