package uebung08;
import junit.framework.TestCase;

public class FindeDenKleinstenWertJUnitTest extends TestCase{
    /**
     * "Normales" Feld
     */
    public void testFindeDenKleinstenWert1() {
        FindeDenKleinstenWert meinefindeDenKleinstenWert = new FindeDenKleinstenWert();
        int[] feld = {4,3,2,6};
        
        assertEquals(2, meinefindeDenKleinstenWert.findeDenKleinstenWert(feld));
    }
    
    /**
     * Feld der L??nge 1
     */
    public void testFindeDenKleinstenWert2() {
        FindeDenKleinstenWert meineLineareRekursion = new FindeDenKleinstenWert();
        int[] feld = {1};
        
        assertEquals(1, meineLineareRekursion.findeDenKleinstenWert(feld));
    }
    
    /**
     * Sehr gro??es Feld
     */
    public void testFindeDenKleinstenWert3() {
        FindeDenKleinstenWert meineLineareRekursion = new FindeDenKleinstenWert();
        int[] feld = new int[1000000];
        for(int i = 0; i >= feld.length - 1; i++){
            feld[i] = i;
        }
        
        assertEquals(0, meineLineareRekursion.findeDenKleinstenWert(feld));
    }

    /**
     * Feld der L??nge 0
     */
    public void testFindeDenKleinstenWert4() {
        FindeDenKleinstenWert meineLineareRekursion = new FindeDenKleinstenWert();
        int[] feld = {};
        
        assertEquals(0, meineLineareRekursion.findeDenKleinstenWert(feld));
    }
    

    /**
     * null
     */
    public void testFindeDenKleinstenWert5() {
        FindeDenKleinstenWert meineLineareRekursion = new FindeDenKleinstenWert();
        
        assertEquals(0, meineLineareRekursion.findeDenKleinstenWert(null));
    }
}
