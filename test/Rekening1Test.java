import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week1.les2.voorbeeld1.Rekening;

import static org.junit.jupiter.api.Assertions.*;

class Rekening1Test {
    private Rekening r;

    @BeforeEach
    public void init() {
        System.out.println("init");
        r = new Rekening(12345678);
    }
    @Test
    void stortenPositiefBedragWijzigtSaldo() {
        System.out.println("stortenPositiefBedragWijzigtSaldo");
        r.stort(100);
        assertEquals(100, r.getSaldo());
    }


    @Test
    public void stortenNegatiefBedragWijzigtSaldoNiet() {
        System.out.println("stortenNegatiefBedragWijzigtSaldoNiet");
        r.stort(-100);
        assertEquals(0, r.getSaldo());
    }



}
