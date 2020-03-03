package practica.practicum4B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    Auto a1 = new Auto("Peugeot 207", 50);
    Klant k1 = new Klant("Mijnheer de Vries");
    private Autohuur huur;

    @BeforeEach
    public void init() {
        System.out.println("Before test: ");
        huur = new Autohuur();
    }

    @Test
    public void geenHuurderGeenAuto() {
        assertNull(huur.getHuurder());
        assertNull(huur.getGehuurdeAuto());
        assertEquals(0.0, huur.totaalPrijs());
        assertTrue(huur.toString().contains("er is geen huurder bekend"));
        assertTrue(huur.toString().contains("er is geen auto bekend"));
        System.out.println("Correcte invoer");
    }

    @Test
    public void geenHuurderWelAuto() {
        huur.setGehuurdeAuto(a1);
        assertNull(huur.getHuurder());
        assertSame(huur.getGehuurdeAuto(), a1);
        assertEquals(0, huur.totaalPrijs());
        assertTrue(huur.toString().contains("er is geen huurder bekend"));
        assertTrue(huur.toString().contains(a1.toString()));
        System.out.println("Correcte invoer");
    }

    @Test
    public void welHuurderGeenAuto() {
        huur.setHuurder(k1);
        assertSame(huur.getHuurder(), k1);
        assertNull(huur.getGehuurdeAuto());
        //assertEquals(0, huur.totaalPrijs());
        assertTrue(huur.toString().contains("Mijnheer de Vries"));
        assertTrue(huur.toString().contains("er is geen auto bekend"));
        System.out.println("Correcte invoer");
    }
}