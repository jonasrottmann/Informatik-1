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

    private char umbennen(int i) {
        if (i == 1) {
            return 'X';
        } else if (i == -1) {
            return 'O';
        } else {
            return ' ';
        }
    }

    public void spielerAnsagen() {
        if (model.getSpielzugCounter() % 2 == 0) { // Ansagen wer am Zug ist
            System.out.println("Spieler X ist am Zug.");
        } else {
            System.out.println("Spieler O ist am Zug.");
        }
    }

    public void zeileAnfordern() {
        System.out.print("Gib die Zeile ein (0,1,2): ");
    }

    public void spalteAnfordern() {
        System.out.print("Gib die Spalte ein (0,1,2): ");
    }

    public void zugFehler() {
        System.out.println("Zug nicht erlaubt. Erneut eingeben!");
        System.out.println();
    }

    public void zugErfolgreich() {
        System.out.println("Okay.");
        System.out.println();
    }

    public void siegerKüren() {
        System.out.println("Glückwunsch! Spieler " + ((model.pruefeSieg() == 1) ? "X" : "O") + " hat gewonnen!");
        System.out.println("------------------------------------");
        System.out.println();
    }

    public void unentschieden() {
        System.out.println("Unentschieden!");
        System.out.println("------------------------------------");
        System.out.println();
    }
}
