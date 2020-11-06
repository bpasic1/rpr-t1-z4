package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    Korpa k = new Korpa();
    @Test
    void dodajArtikl() {
        Artikl art = new Artikl("Komp", 1000, "1");
        assertTrue(k.dodajArtikl(art));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl a = new Artikl("Knjiga", 12, "23");
        Artikl at = new Artikl("Vreca", 100, "13");
        Artikl art = new Artikl("Bandaze", 10, "33");
        k.dodajArtikl(art);
        k.dodajArtikl(at);
        k.dodajArtikl(a);
        k.izbaciArtiklSaKodom("23");
        assertNotEquals(5,k.getBr());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        k.dodajArtikl(new Artikl("Kimono", 50, "1"));
        k.dodajArtikl(new Artikl("Teg", 22, "2"));
        assertEquals(72, k.dajUkupnuCijenuArtikala());
    }
}