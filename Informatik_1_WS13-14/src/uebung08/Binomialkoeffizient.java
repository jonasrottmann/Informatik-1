package uebung08;
/**
 * Eine Klasse zur rekursiven Berechnung des Binomialkoeffizienten n über k mit Hilfe des Pascal'schen Dreiecks.
 *                 1
 *              1       1
 *          1       2       1
 *      1       3       3       1
 *  1       4       6       4       1
 *  
 * @author jonas
 * 
 */
public class Binomialkoeffizient {

    private int aufrufzaehler = 0;

    /**
     * Berechnet den Binomialkoeffizienten von <code>n</code> über
     * <code>k</code> mit Hilfe des Pascal'schen Dreiecks.
     * 
     * @param n
     *            Zeile im Pascal'schen Dreieck
     * @param k
     *            Stelle im Pascal'schen Dreieck
     * @return Den Binomialkoeffizienten <code>n</code> über <code>k</code>
     */
    public long getBinomialKoeffizient(int n, int k) {
        aufrufzaehler++;
        if (n < 0 || k < 0 || n < k) {
            return 0;
        } else if (k == 0 || n == k) {
            return 1;
        } else {
            return getBinomialKoeffizient(n - 1, k - 1) + getBinomialKoeffizient(n - 1, k);
        }
    }

    /**
     * Gibt die Anzahl der Rekusiven Aufrufe zurück.
     * 
     * @return Die Anzahl der Rekursiven Aufrufe.
     */
    public int getAufrufzaehler() {
        return aufrufzaehler - 1; // eins abziehen, da erster Methodenaufruf
                                  // nicht als "Rekursiver Aufruf" zählt
    }

    /**
     * Setzt den Aufrufzähler wieder auf 0.
     */
    public void resetAufrufzaehler() {
        aufrufzaehler = 0;
    }

}
