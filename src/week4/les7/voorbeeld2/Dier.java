package week4.les7.voorbeeld2;

public class Dier {
    private int aantalPoten;
    private boolean isZoogdier;
    private int wekenDrachtig;

    public Dier(int aP){
        this(aP, false, 0);
    }

    public Dier(int aP, boolean isZ) {
        this (aP, isZ, 0);
    }
//        if(aP < 0 ){
//            System.out.println("een dier heeft nul of meer poten");
//            aP = 0;
//        }
//        aantalPoten = aP;
//        isZoogdier = isZ;
//        wekenDrachtig = 0;
//
//    }

    public Dier(int aP, boolean isZ, int wD){
        if(aP < 0 ){
            System.out.println("een dier heeft nul of meer poten");
            aP = 0;
        }
        aantalPoten = aP;
        isZoogdier = isZ;
        wekenDrachtig = wD;
    }

    @Override
    public String toString() {
        return "Dier{" +
                "aantalPoten=" + aantalPoten +
                ", isZoogdier=" + isZoogdier +
                ", wekenDrachtig=" + wekenDrachtig +
                '}';
    }
}
