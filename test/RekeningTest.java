package week2.les3.voorbeeld1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RekeningTest {
    @Test
    public void stortenPositiefBedragWijzigtSaldo() {
        Rekening rekening = new Rekening(12345678);
        rekening.stort(500);
        assertEquals(400, rekening.getSaldo());

        rekening.stort(300);
        assertEquals(800, rekening.getSaldo(), "test mislukt");
    }

}
