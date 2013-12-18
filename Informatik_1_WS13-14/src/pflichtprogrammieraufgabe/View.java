package pflichtprogrammieraufgabe;

public class View {
    Model model;

    public View(Model model) {
        this.model = model;
    }

    /**
     * Gibt das aktuelle Spielfeld auf dem Monitor aus.
     */
    public void printSpielfeld() {
        System.out.println(" " + umbennen(model.getFeld(0, 0)) + " | " + umbennen(model.getFeld(0, 1)) + " | "
                + umbennen(model.getFeld(0, 2)));
        System.out.println("-----------");
        System.out.println(" " + umbennen(model.getFeld(1, 0)) + " | " + umbennen(model.getFeld(1, 1)) + " | "
                + umbennen(model.getFeld(1, 2)));
        System.out.println("-----------");
        System.out.println(" " + umbennen(model.getFeld(2, 0)) + " | " + umbennen(model.getFeld(2, 1)) + " | "
                + umbennen(model.getFeld(2, 2)));
        System.out.println();
    }
    
    /**
     * Gibt statt den Codierungen <code>1</code> bzw. <code>-1</code> für Spieler 1 bzw. 2 "X" bzw. "O" zurück.
     * 
     * @param i <code>1</code> bzw. <code>-1</code>, je nach Spieler.
     * @return 'X' oder 'O', je nach Spieler.
     */
    private char umbennen(int i) {
        if (i == 1) {
            return 'X';
        } else if (i == -1) {
            return 'O';
        } else {
            return ' ';
        }
    }
    
    /**
     * Gibt auf dem Bildschirm aus, welcher Spieler am Zug ist.
     */
    public void spielerAnsagen() {
        if (model.getSpielzugCounter() % 2 == 0) { // Ansagen wer am Zug ist
            System.out.println("Spieler X ist am Zug.");
        } else {
            System.out.println("Spieler O ist am Zug.");
        }
    }
    
    /**
     * Gibt die Aufforderung aus, eine Zeilennummer anzugeben.
     */
    public void zeileAnfordern() {
        System.out.print("Gib die Zeile ein (0,1,2): ");
    }

    /**
     * Gibt die Aufforderung aus, eine Spaltennummer anzugeben.
     */
    public void spalteAnfordern() {
        System.out.print("Gib die Spalte ein (0,1,2): ");
    }
    
    /**
     * Gibt einen Hinweis aus, dass der gewünschte Zug nicht erlaubt ist.
     */
    public void zugFehler() {
        System.out.println("Zug nicht erlaubt. Erneut eingeben!");
        System.out.println();
    }
    
    /**
     * Gibt einen Hinweis aus, dass der gewünschte Zug erfolgreich war.
     */
    public void zugErfolgreich() {
        System.out.println("Okay.");
        System.out.println();
    }
    
    /**
     * Gratuliert dem Sieger.
     */
    public void sieg() {
        System.out.println("Glückwunsch! Spieler " + ((model.pruefeSieg() == 1) ? "X" : "O") + " hat gewonnen!");
        System.out.println("------------------------------------");
        System.out.println();
    }
    
    /**
     * Verkündet ein Unentschieden.
     */
    public void unentschieden() {
        System.out.println("Unentschieden!");
        System.out.println("------------------------------------");
        System.out.println();
    }
}
