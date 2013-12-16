package pflichtprogrammieraufgabe;

public class View {
    Model model;
    
    public View(Model model){
        this.model = model;
    }
    
    /**
     * Gibt das aktuelle Spielfeld auf dem Monitor aus.
     */
    public void printSpielfeld(){
        System.out.println(" " + umbennen(model.getFeld(0, 0)) + " | " + umbennen(model.getFeld(0, 1)) + " | " + umbennen(model.getFeld(0, 2)));
        System.out.println("-----------");
        System.out.println(" " + umbennen(model.getFeld(1, 0)) + " | " + umbennen(model.getFeld(1, 1)) + " | " + umbennen(model.getFeld(1, 2)));
        System.out.println("-----------");
        System.out.println(" " + umbennen(model.getFeld(2, 0)) + " | " + umbennen(model.getFeld(2, 1)) + " | " + umbennen(model.getFeld(2, 2)));
        System.out.println();
    }
    
    /**
     * Gibt für Spieler 1 ein X und für Spieler 2 ein O aus.
     * Ist notwendig, da Spieler 1 im Spielfeld mit 1 und Spieler 2 mit -1 codiert ist.
     * @param i
     * @return
     */
    private char umbennen(int i){
        if(i == 1){
            return 'X';
        }else if(i == -1){
            return 'O';
        }else{
            return ' ';
        }
    }
    
    /**
     * 
     */
    public void siegerNachricht(){
        printSpielfeld();
        if (model.pruefeSieg() != 0) {
            System.out.println("Glückwunsch! Spieler " + ((model.pruefeSieg() == 1) ? "X" : "O") + " hat gewonnen!");
            System.out.println();
        }
    }
}
