package uebung08;
/**
 * 
 * @author jonas
 * 
 */
public class KleinsterWert {

    private int minimum = Integer.MAX_VALUE;

    /**
     * Gibt den kleinsten Wert des übergebenen Feldes zurück.
     * 
     * @param feld
     *            Das zu durchsuchende Feld.
     * @return Der kleinste Wert des zu durchsuchenden Feldes.
     */
    public int findeDenKleinstenWert(int[] feld) {
        return findeDenKleinstenWertRekursiv(feld, 0);
        
        // return findeDenKleinstenWertIterativ(feld);
    }

    /**
     * Findt den kleinsten Wert in einem int-Feld und gibt diesen zurück.
     * 
     * @param feld
     *            int-Feld beliebiger Länge
     * @param position
     *            zum Start immer 0
     * @return den kleinsten Wert des Feldes
     */
    private int findeDenKleinstenWertRekursiv(int[] feld, int position) {
        if (feld == null || feld.length == 0) {
            // Fehlerabfang
            return 0;
        } else if (feld[position] < minimum) {
            minimum = feld[position];
        }
        if (position == feld.length - 1) {
            return minimum; // Rekursionsabbruch
        }
        return findeDenKleinstenWertRekursiv(feld, position + 1);
    }
    
    
    
    
    
    
    
    private int findeDenKleinstenWertIterativ(int[] feld) {
        int minimum = feld[0];
        for (int i = 1; i < feld.length; i++) {
            if (feld[i] < minimum) {
                minimum = feld[i];
            }
        }
        return minimum;
    }
}
