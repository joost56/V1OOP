package practica.practicum2B;

public class Main {
    public static void main(String[] args) {
        Voetbalclub liv = new Voetbalclub(1," Liverpool      ", 25,24,1,0,73 );
        Voetbalclub manc = new Voetbalclub(2," Manchester City", 25,16,3,6,51);
        Voetbalclub lec = new Voetbalclub(3," Leicester City ", 25,15,4,6,49);
        Voetbalclub che = new Voetbalclub(4," Chelsea        ",25,12,5,8,41);
        Voetbalclub she = new Voetbalclub(5," Sheff Utd      ",26,10,9,7,39);
        Voetbalclub tot = new Voetbalclub(6," Tottenham      ", 25,10,7,8,37);
        Voetbalclub eve = new Voetbalclub(7," Everton        ",26,10,6,10,36);
        Voetbalclub manu = new Voetbalclub(8," Man Utd        ",25,9,8,8,35);
        Voetbalclub wol = new Voetbalclub(9," Wolverhampton  ",25,8,11,6,35);
        Voetbalclub ars = new Voetbalclub(10," Arsenal        ",25,6,13,6,31);
        Voetbalclub bur = new Voetbalclub(11," Burnley        ",25,9,4,12,31);
        Voetbalclub newc = new Voetbalclub(12," Newcastle      ",25,8,7,10,31);
        Voetbalclub sou = new Voetbalclub(13," Southampton    ",25,9,4,12,31);
        Voetbalclub cry = new Voetbalclub(14," Crystal Palace ",26,7,9,10,30);
        Voetbalclub bri = new Voetbalclub(15," Brighton       ",26,6,9,11,27);
        Voetbalclub bou = new Voetbalclub(16," Bournemouth    ",26,7,5,14,26);
        Voetbalclub ast = new Voetbalclub(17," Aston Villa    ",25,7,4,14,25);
        Voetbalclub wes = new Voetbalclub(18," West Ham       ",25,6,6,13,24);
        Voetbalclub wat = new Voetbalclub(19," Watford        ",26,5,9,12,24);
        Voetbalclub nor = new Voetbalclub(20," Norwich City   ",25,4,6,15,18);


        System.out.println("Liverpool punten: " + liv.aantalPunten());
        System.out.println("Manchester City gespeeld: " + manc.aantalGespeeld());
        System.out.println();

        System.out.println(liv);
        System.out.println(manc);
        System.out.println(lec);
        System.out.println(che);
        System.out.println(she);
        System.out.println(tot);
        System.out.println(eve);
        System.out.println(manu);
        System.out.println(wol);
        System.out.println(ars);
        System.out.println(bur);
        System.out.println(newc);
        System.out.println(sou);
        System.out.println(cry);
        System.out.println(bri);
        System.out.println(bou);
        System.out.println(ast);
        System.out.println(wes);
        System.out.println(wat);
        System.out.println(nor);
    }
}
