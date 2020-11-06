package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    Supermarket s = new Supermarket();

    @Test
    void dodajArtikl() {
        Artikl a = new Artikl("Tip", 2, "1");
        assertTrue(s.dodajArtikl(a));
    }

    @Test
    void izbaciArtiklSaKodom() {
        s.dodajArtikl(new Artikl("kartica", 50, "17"));
        s.dodajArtikl(new Artikl("knjiga", 34, "13"));
        s.dodajArtikl(new Artikl("hljeb", 1, "224"));
        s.izbaciArtiklSaKodom(("17"));
        assertNotEquals(3, s.getBr());
    }

}