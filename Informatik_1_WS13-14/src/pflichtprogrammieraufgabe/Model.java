package pflichtprogrammieraufgabe;

public class Model {

    /**
     * Das Spielfeld als 3x3 Array.
     */
    private int[][] spielfeld = new int[3][3];
    private int spielzugCounter = 0;

    /**
     * Gib den Inhalt eines bestimmen Feldes zurück.
     * 
     * @param zeile
     * @param reihe
     * @return
     */
    public int getFeld(int zeile, int spalte) {
            return spielfeld[zeile][spalte];
    }

    /**
     * Führt den Zug eines gegebenen Spieler auf die gegebene Position aus.
     * 
     * @param spieler Spieler 1 oder 2
     * @param zeile
     * @param spalte
     * @return
     */
    public boolean doSpielzug(int spieler, int zeile, int spalte) {
        if (spieler > 0 && spieler < 3 && zeile >= 0 && zeile < spielfeld.length && spalte >= 0
                && spalte < spielfeld[zeile].length) {
            // Fehlerabfang
            if (spielfeld[zeile][spalte] == 0) {
                spielfeld[zeile][spalte] = (spieler == 1) ? 1 : -1;
                spielzugCounter += 1;
                return true; // Erfolgreich gesetzt
            }
        }
        return false; // Feld schon besetzt
    }

    /**
     * Prüft ob ein Spieler schon gewonnen hat.
     * 
     * @return <code>1</code> falls Spieler 1 gewonnen hat, <code>2</code> falls
     *         Spieler 2 gewonnen hat, <code>0</code> wenn es (noch) keinen
     *         Sieger gibt
     */
    public int pruefeSieg() {
        // Prüfe Zeilen
        for (int zeile = 0; zeile < 3; zeile++) {
            if ((spielfeld[zeile][0] + spielfeld[zeile][1] + spielfeld[zeile][2]) == 3) {
                return 1;
            }
            if ((spielfeld[zeile][0] + spielfeld[zeile][1] + spielfeld[zeile][2]) == -3) {
                return 2;
            }
        }
        // Prüfe Spalten
        for (int spalte = 0; spalte < 3; spalte++) {
            if ((spielfeld[0][spalte] + spielfeld[1][spalte] + spielfeld[2][spalte]) == 3) {
                return 1;
            }
            if ((spielfeld[0][spalte] + spielfeld[1][spalte] + spielfeld[2][spalte]) == -3) {
                return 2;
            }
        }
        // Prüfe Diagonalen
        // links oben nach rechts unten
        if ((spielfeld[0][0] + spielfeld[1][1] + spielfeld[2][2]) == 3) {
            return 1;
        }
        if ((spielfeld[0][0] + spielfeld[1][1] + spielfeld[2][2]) == -3) {
            return 2;
        }
        // rechts oben nach links unten
        if ((spielfeld[0][2] + spielfeld[1][1] + spielfeld[2][0]) == 3) {
            return 1;
        }
        if ((spielfeld[0][2] + spielfeld[1][1] + spielfeld[2][0]) == -3) {
            return 2;
        }
        return 0;
    }

    /**
     * Prüfe ob noch freie Felder auf dem Spielfeld vorhanden sind.
     * 
     * @return
     */
    public boolean isFeldVoll() {
        for (int zeile = 0; zeile < spielfeld.length; zeile++) {
            for (int spalte = 0; spalte < spielfeld[zeile].length; spalte++) {
                if (spielfeld[zeile][spalte] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Setzt das Spielfeld auf den Anfangszustand zurück.
     */
    public void resetFeld() {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                spielfeld[i][j] = 0;
            }
        }
        spielzugCounter = 0;
    }

    public int getSpielzugCounter() {
        return spielzugCounter;
    }
}