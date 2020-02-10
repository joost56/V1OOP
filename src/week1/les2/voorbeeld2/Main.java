package week1.les2.voorbeeld2;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Ipad", "1234AB", 614.00);
        Product product2 = new Product("Paracethamol" , "5678CD");
        product1.setBtw(19.0);
        product2.setPrijs(1.90);
        product2.setBtw(6.0);
        System.out.println(product1);
        System.out.println(product2);

        System.out.println("Btw percentage: " + product2.getBtw());
        System.out.println("Betaalde BTW: " + product2.btwBedrag());
        System.out.println("Prijs: " + product2.getPrijs());
    }
}