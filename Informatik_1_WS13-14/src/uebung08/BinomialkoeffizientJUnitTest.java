package uebung08;
import junit.framework.TestCase;

public class BinomialkoeffizientJUnitTest extends TestCase{
    public void testGetBinomialKoeffizient1() {
        Binomialkoeffizient meinBinomialkoeffizient = new Binomialkoeffizient();
        assertEquals(1, meinBinomialkoeffizient.getBinomialKoeffizient(0, 0));
    }
    
    public void testGetBinomialKoeffizient2() {
        Binomialkoeffizient meinBinomialkoeffizient = new Binomialkoeffizient();
        assertEquals(0, meinBinomialkoeffizient.getBinomialKoeffizient(4, 8));
    }
    
    public void testGetBinomialKoeffizient3() {
        Binomialkoeffizient meinBinomialkoeffizient = new Binomialkoeffizient();
        assertEquals(0, meinBinomialkoeffizient.getBinomialKoeffizient(-2, -3));
    }
    
    public void testGetBinomialKoeffizient4() {
        Binomialkoeffizient meinBinomialkoeffizient = new Binomialkoeffizient();
        assertEquals(75582, meinBinomialkoeffizient.getBinomialKoeffizient(19, 8));
    }
}
