package uebung08;
import junit.framework.TestCase;

public class KleinsterWertJUnitTest extends TestCase{
    /**
     * "Normales" Feld
     */
    public void testFindeDenKleinstenWert1() {
        KleinsterWert meinKleinsterWert = new KleinsterWert();
        int[] feld = {4,3,2,6};
        
        assertEquals(2, meinKleinsterWert.findeDenKleinstenWert(feld));
    }
    
    /**
     * Feld der Länge 1
     */
    public void testFindeDenKleinstenWert2() {
        KleinsterWert meinKleinsterWert = new KleinsterWert();
        int[] feld = {1};
        
        assertEquals(1, meinKleinsterWert.findeDenKleinstenWert(feld));
    }
    
    /**
     * Sehr großes Feld
     */
    public void testFindeDenKleinstenWert3() {
        KleinsterWert meinKleinsterWert = new KleinsterWert();
        int[] feld = new int[1000000];
        for(int i = 0; i >= feld.length - 1; i++){
            feld[i] = i;
        }
        
        assertEquals(0, meinKleinsterWert.findeDenKleinstenWert(feld));
    }

    /**
     * Feld der Länge 0
     */
    public void testFindeDenKleinstenWert4() {
        KleinsterWert meinKleinsterWert = new KleinsterWert();
        int[] feld = {};
        
        assertEquals(0, meinKleinsterWert.findeDenKleinstenWert(feld));
    }
    

    /**
     * null
     */
    public void testFindeDenKleinstenWert5() {
        KleinsterWert meinKleinsterWert = new KleinsterWert();
        
        assertEquals(0, meinKleinsterWert.findeDenKleinstenWert(null));
    }
}
