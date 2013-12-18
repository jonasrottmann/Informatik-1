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
     *            Als zweidimensionales, symmetrisches 9x9 int-Feld, gefüllt mit
     *            Werten von 1 bis 9.
     */
    public Sudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }

    /**
     * 
     * Methode um zu prüfen ob ein Sudoku korrekt gelöst wurde. Prüft zuerst ob
     * in jeder Zeile die Zahlen von 1 bis 9 jeweils einmal vorkommen, danach
     * die Spalten und am Schluss jeden 3x3 Block.
     * <table>
     * <tbody>
     * <tr>
     * <th>n\k</th>
     * <th><i>0</i></th>
     * <th><i>1</i></th>
     * <th><i>2</i></th>
     * </tr>
     * <tr>
     * <th><i>0</i></th>
     * <td>0</td>
     * <td>3</td>
     * <td>6</td>
     * </tr>
     * <tr>
     * <th><i>1</i></th>
     * <td>1</td>
     * <td>4</td>
     * <td>7</td>
     * </tr>
     * <tr>
     * <th><i>2</i></th>
     * <td>2</td>
     * <td>5</td>
     * <td>8</td>
     * </tr>
     * </tbody>
     * </table>
     * @return
     */
    public boolean pruefen() {
        // Zeilen prüfen
        for (int zeile = 0; zeile < sudoku.length; zeile++) {
            for (int stelle = 0; stelle < sudoku[zeile].length; stelle++) {
                if(sudoku[zeile][stelle] > 9){
                    return false; //ArrayOutOfBounds vermeiden
                }else if (checkliste[sudoku[zeile][stelle] - 1]) {
                    return false;
                } else {
                    checkliste[sudoku[zeile][stelle] - 1] = true;
                }
            }
            checklisteZurueksetzen();
        }
        // Spalten prüfen
        for (int spalte = 0; spalte < sudoku.length; spalte++) {
            for (int stelle = 0; stelle < sudoku[spalte].length; stelle++) {
                if (checkliste[sudoku[stelle][spalte] - 1]) {
                    return false;
                } else {
                    checkliste[sudoku[stelle][spalte] - 1] = true;
                }
            }
            checklisteZurueksetzen();
        }
        // Blöcke prüfen
        for (int k = 0; k < 3; k++) {
            for (int n = 0; n < 3; n++) {
                for (int zeile = n * 3; zeile < (n * 3) + 3; zeile++) {
                    for (int stelle = k * 3; stelle < (k * 3) + 3; stelle++) {
                        if (checkliste[sudoku[zeile][stelle] - 1]) {
                            return false;
                        } else {
                            checkliste[sudoku[zeile][stelle] - 1] = true;
                        }
                    }
                }
                checklisteZurueksetzen();
            }
        }
        return true;
    }
}