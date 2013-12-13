package uebung01;
/**
 * Programm zur Berechnung von...?
 * 
 * @author Jonas Rottmann
 * @version 1.0
 */
public class Bankkonto {
    /**
     * Gibt einen Kontoauszug aus.
     * @param args
     */
    public static void main(String[] args) {
        double guthaben = 0.0; // Guthaben in Euro
        
        System.out.println("Guthaben = " + guthaben);
        guthaben = guthaben + 100.0; //Einzahlung
        System.out.println("Guthaben = " + guthaben);
        guthaben = guthaben - 50.0; //Auszahlung
        System.out.println("Guthaben = " + guthaben);
        guthaben = guthaben + zinsen(guthaben);
        System.out.println("Zinsen = " + guthaben);
        
    }
    
    /**
     * Methode zum Errechnen der Zinsen zu einem bestimmten Zinssatz.
     * @param guthaben in Euro
     * @return Zinsen in Euro
     */
    public static double zinsen (double guthaben){
        double zinssatz = 10; // Zinssatz in %
        return guthaben / (100 * zinssatz);
    }
}