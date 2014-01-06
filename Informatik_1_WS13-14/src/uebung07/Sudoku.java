package uebung07;

/**
 * 
 * @author jonas
 * 
 */
public class Sudoku {

    private int[][] sudoku;
    private boolean[] checkliste = new boolean[9];

    /**
     * Füllt das Feld <code>checkliste</code> mit false.
     */
    private void checklisteZurueksetzen() {
        for (int i = 0; i < 9; i++) {
            checkliste[i] = false;
        }
    }

    /**
     * Erzeugt ein neues Sudoku mit den Werten der gegebenen Lösung.
     * 
     * @param sudoku
     *            Zweidimensionales, symmetrisches 9x9 int-Feld, gefüllt mit
     *            Werten von 1 bis 9.
     */
    public Sudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }

    /**
     * 
     * Prüft ob ein Sudoku korrekt gelöst wurde. Prüft zuerst ob in jeder Zeile
     * die Zahlen von 1 bis 9 jeweils einmal vorkommen, danach die Spalten und
     * am Schluss jeden 3x3 Block.
     * 
     * @return
     */
    public boolean pruefen() {
        // Zeilen prüfen
        for (int zeile = 0; zeile < sudoku.length; zeile++) {
            for (int spalte = 0; spalte < sudoku[zeile].length; spalte++) {
                if (sudoku[zeile][spalte] > 9 || sudoku[zeile][spalte] < 1) {
                    return false; // ArrayOutOfBounds bei checkliste vermeiden,
                                  // falls im Sudoku Zahlen größer 9 eingetragen
                                  // wurden
                } else if (checkliste[sudoku[zeile][spalte] - 1]) {
                    return false;
                } else {
                    checkliste[sudoku[zeile][spalte] - 1] = true;
                }
            }
            checklisteZurueksetzen();
        }
        // Spalten prüfen
        for (int spalte = 0; spalte < sudoku.length; spalte++) {
            for (int zeile = 0; zeile < sudoku[spalte].length; zeile++) {
                if (checkliste[sudoku[zeile][spalte] - 1]) {
                    return false;
                } else {
                    checkliste[sudoku[zeile][spalte] - 1] = true;
                }
            }
            checklisteZurueksetzen();
        }
        // Blöcke prüfen
        for (int k = 0; k < 3; k++) {
            for (int n = 0; n < 3; n++) {
                for (int zeile = n * 3; zeile < (n * 3) + 3; zeile++) {
                    for (int spalte = k * 3; spalte < (k * 3) + 3; spalte++) {
                        if (checkliste[sudoku[zeile][spalte] - 1]) {
                            return false;
                        } else {
                            checkliste[sudoku[zeile][spalte] - 1] = true;
                        }
                    }
                }
                checklisteZurueksetzen();
            }
        }
        return true;
    }
}