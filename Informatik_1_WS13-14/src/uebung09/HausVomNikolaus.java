package uebung09;

/**
 * HausVomNikolaus ist verantwortlich eine LÃ¶sung zu finden, das Haus vom
 * Nikolaus ab einem Knoten ohne Unterbruch zu zeichnen. Die Kanten des Hauses
 * werden als Adjazentmatrix gespeichert {@link #haus}. Die LÃ¶sung wird mit
 * einen Backtrackingalgorithmus gesucht {@link #sucheLoesung}.
 * 
 * @author Christian Pape
 */
public class HausVomNikolaus {

    private static final int KEINE_KANTE = 0;
    private static final int KANTE = 1;
    private static final int KANTE_GEZEICHNET = 2;

    /**
     * Definiert, welche Kanten es überhaupt gibt. Man stelle sich dazu vor,
     * dass die Anfangs- und Endpunkte der Kanten einfach als Zahlen codiert
     * sind:
     * 
     * <pre>
     *     4
     *    / \
     *   /   \
     *  /     \
     * 2 ----- 3
     * |\     /|
     * | \   / |
     * |  \ /  |
     * |  / \  |
     * | /   \ |
     * |/     \|
     * 0-------1
     * </pre>
     * 
     * Gültige Kanten sind dann Kanten von Knoten 0 nach 1, von 0 nach 3 und von
     * 0 nach 2; ungültig ist aber die Kante 0 nach 4. Wenn haus[i][k] == KANTE
     * gilt, dann ist die Kante von i nach k eine für das Haus des Nikolaus
     * gültige Kante. Da die Kante in beiden Richtungen abgelaufen werden
     * können, ist haus[i][j] == haus[j][i]. Wenn in {@link #sucheLoesung} eine
     * Kante &quot;gezeichnet&quot; wurde, dann werden sowohl haus[i][j] als
     * auch haus[j][i] auf KANTE_GEZEICHNET gesetzt.
     * 
     */
    private int haus[][] = {{ 0,     KANTE, KANTE, KANTE, 0 },
                            { KANTE, 0,     KANTE, KANTE, 0 },
                            { KANTE, KANTE, 0,     KANTE, KANTE },
                            { KANTE, KANTE, KANTE, 0,     KANTE },
                            { 0,     0,     KANTE, KANTE, 0 }};

    /**
     * Das Haus vom Nikolaus hat gerade so viel Knoten, wie die Dimension der
     * Adjazenzmatrix.
     */
    private int anzahlKnoten = haus.length;

    /**
     * Beim obigen haus ist die Anzahl Kanten 8. Damit das Suchverfahren aber
     * möglichst allgemein ist, wird der Wert aus der gegebenen Adjazenzmatrix
     * im Konstruktor bestimmt.
     */
    private int anzahlKanten;

    /**
     * Beinhaltet die Lösung als Folge der einzelnen Knoten. Der erste Knoten
     * ist nicht hier enthalten. Zusammen mit dem Anfangsknoten, beinhaltet
     * loesung die Folge der Knoten die zum Zeichnen des Hauses benötigt wird.
     * <p>
     * Eine Lösung von Knoten 0 ist zum Beispiel: 1 2 0 3 2 4 3 1. Das heisst
     * von 0 nach Knoten 1, dann nach Knoten 2, usw, und zum Schluss von Knoten
     * 3 nach 1.
     * </p>
     */
    private int loesung[];

    public HausVomNikolaus() {
        anzahlKanten = 0;
        
        for (int i = 0; i < anzahlKnoten; i++) {
            for (int j = i; j < anzahlKnoten; j++) {
                if (haus[i][j] == KANTE) {
                    anzahlKanten++;
                }
            }
        }
        loesung = new int[anzahlKanten];
    }

    /**
     * Setzte alle Werte von loesung auf -1. Dies ist nÃ¶tig, um spÃ¤ter zu
     * identifzieren, ob Ã¼berhaupt eine LÃ¶sung gefunden wurde bzw. zum
     * debuggen sinvoll
     */
    void initLoesung() {
        for (int i = 0; i < loesung.length; i++) {
            loesung[i] = -1;
        }
    }

    /**
     * Sucht mit Backtracking eine Zeichenreihenfolge, um das Haus vom Nikolaus
     * ohne den Stift abzusetzten zu zeichnen.
     * 
     * @param knoten
     *            die derzeitige Position des Zeichenstifts
     * @param i
     *            die Anzahl bereits gezeichneter Kanten
     * 
     * @return true, wenn eine Lösung gefunden wurde
     */
    boolean sucheLoesung(int knoten, int i) {
        for (int k = 0; k < anzahlKnoten; k++) {
            if (kanteIstUnbesucht(knoten, k)) {
                loesung[i] = k;
                kanteZeichnen(knoten, k);
                if (i < loesung.length - 1) {
                    if (sucheLoesung(k, i + 1)) {
                        return true;
                    } else {
                        kanteZuruecksetzen(knoten, k);
                        loesung[i] = -1;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Markiert die Kante von knoten bis j in beiden Richtungen als ablaufbare
     * Kante.
     */
    private void kanteZuruecksetzen(int knoten, int i) {
        haus[knoten][i] = KANTE;
        haus[i][knoten] = KANTE;
    }

    /**
     * Markiert die Kante von i bis j in beiden Richtungen als bereits
     * abgelaufen.
     */
    private void kanteZeichnen(int i, int j) {
        haus[j][i] = KANTE_GEZEICHNET;
        haus[i][j] = KANTE_GEZEICHNET;
    }

    /**
     * Gibt true zurück, wenn die Kante von knoten bis i ablaufbar ist.
     */
    private boolean kanteIstUnbesucht(int knoten, int i) {
        return haus[knoten][i] == KANTE && haus[i][knoten] == KANTE;
    }

    /**
     * Gibt die Lösung als Folge der abgelaufenen Knoten aus.
     */
    private void print() {
        for (int i = 0; i < loesung.length; i++) {
            System.out.print(loesung[i] + "\t");
        }
        System.out.println();
    }

    /**
     * Sucht jeweils für jeden Knoten 0 bis 4 eine Lösung und gibt sie aus
     * (falls eine existiert).
     */
    public static void main(String args[]) {
        HausVomNikolaus hausVomNikolaus = new HausVomNikolaus();

        for (int i = 0; i < hausVomNikolaus.anzahlKnoten; i++) {
            hausVomNikolaus = new HausVomNikolaus();
            System.out.println("Suche Lösung ab Knoten " + i);
            if (hausVomNikolaus.sucheLoesung(i, 0)) {
                System.out.print("  Lösung: ");
                hausVomNikolaus.print();
            } else {
                System.out.println("  Keine Lösung gefunden");
            }
        }
    }
}