package pflichtprogrammieraufgabe;

public class Controller {
    private Model model;
    private View view;
    private Eingabe eingabe = new Eingabe();

    public Controller(Model model, View view) {
        this.view = view;
        this.model = model;
    }

    public void spielen() {
        while (model.pruefeSieg() == 0 & model.getSpielzugCounter() < 9) {
            view.printSpielfeld(); // Spielfeld zeigen

            if (model.getSpielzugCounter() % 2 == 0) { // Ansagen wer am Zug ist
                System.out.println("Spieler X ist am Zug.");
            } else {
                System.out.println("Spieler O ist am Zug.");
            }

            System.out.print("Gibt die Zeilennummer ein (0,1,2): "); // Zeile
                                                                     // anfordern
            int zeile = eingabe.readInt();
            System.out.print("Gibt die Spaltennummer ein (0,1,2): "); // Spalte
                                                                      // anfordern
            int spalte = eingabe.readInt();
            System.out.println();

            if (!model.doSpielzug((model.getSpielzugCounter() % 2) + 1, zeile, spalte)) {
                System.out.println("Zug nicht erlaubt. Erneut eingeben!");
                System.out.println();
            }else{
                System.out.println("Okay.");
                System.out.println();
            }
        }
        if (model.pruefeSieg() != 0) {
            view.siegerNachricht();
        } else {
            System.out.println("Unentschieden!");
        }
        model.resetFeld();
    }
}