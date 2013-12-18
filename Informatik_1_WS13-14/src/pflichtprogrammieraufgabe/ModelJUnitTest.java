package pflichtprogrammieraufgabe;

import junit.framework.TestCase;

public class ModelJUnitTest extends TestCase {
    public void testDoSpielzugTest1() {
        Model model = new Model();
        model.doSpielzug(1, 0, 0);

        assertEquals(model.getFeld(0, 0), 1);
    }

    public void testDoSpielzugTest2() {
        Model model = new Model();
        model.doSpielzug(2, 2, 2);

        assertEquals(model.getFeld(2, 2), -1);
    }

    public void testDoSpielzugTest3() {
        Model model = new Model();
        model.doSpielzug(3, 0, 0);

        assertEquals(model.getFeld(0, 0), 0);
    }

    public void testDoSpielzugTest4() {
        Model model = new Model();

        assertFalse(model.doSpielzug(1, 5, 5));
    }
}
