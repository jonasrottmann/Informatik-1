package uebung06;

import junit.framework.TestCase;

public class QuersummeJUnitTest extends TestCase {
    public void testQuersummeBerechnen1() {
        Quersumme quersumme = new Quersumme();

        assertEquals(0, quersumme.berechneQuersumme(0));
    }

    public void testQuersummeBerechnen2() {
        Quersumme quersumme = new Quersumme();

        assertEquals(1, quersumme.berechneQuersumme(100));
    }

    public void testQuersummeBerechnen3() {
        Quersumme quersumme = new Quersumme();

        assertEquals(9, quersumme.berechneQuersumme(333));
    }

    public void testQuersummeBerechnen4() {
        Quersumme quersumme = new Quersumme();

        assertEquals(7, quersumme.berechneQuersumme(7));
    }

    public void testQuersummeBerechnen5() {
        Quersumme quersumme = new Quersumme();

        assertEquals((9 + 6 + 8 + 3 + 7 + 6 + 5 + 1), quersumme.berechneQuersumme(96837651));
    }
}
