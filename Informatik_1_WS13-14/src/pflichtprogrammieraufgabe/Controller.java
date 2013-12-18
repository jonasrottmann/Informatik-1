package pflichtprogrammieraufgabe;

public class Controller {
    private Model model;
    private View view;
    private Eingabe eingabe = new Eingabe();

    public Controller(Model model, View view) {
        this.view = view;
        this.model = model;
    }
    
    /**
     * Startet das Spiel.
     */
    public void spielen() {
        while (model.pruefeSieg() == 0 & model.getSpielzugCounter() < 9) {
            int zeile, spalte;

            view.printSpielfeld(); // Spielfeld zeigen

            view.spielerAnsagen();
            view.zeileAnfordern();
            zeile = eingabe.readInt();
            view.spalteAnfordern();
            spalte = eingabe.readInt();

            if (!model.doSpielzug((model.getSpielzugCounter() % 2) + 1, zeile, spalte)) {
                view.zugFehler();
            } else {
                view.zugErfolgreich();
            }
        }
        if (model.pruefeSieg() != 0) {
            view.printSpielfeld();
            if (model.pruefeSieg() != 0) {
                view.sieg();
            }
        } else {
            view.unentschieden();
        }
        model.resetFeld();
    }
}