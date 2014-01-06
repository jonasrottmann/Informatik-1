package uebung08;

public class Main {

    public static void main(String[] args) {
        Binomialkoeffizient meinBinomialkoeffizient = new Binomialkoeffizient();
        long zeitVorher, zeitNachher, dauer;
        
        for (int i = 0; i <= 30; i++) {
            System.out.print("i: ");
            System.out.print(i);
            System.out.print(" - Binomialkoeffizient: ");
            zeitVorher = System.currentTimeMillis(); // Zeit nehmen
            System.out.print(meinBinomialkoeffizient.getBinomialKoeffizient(i, i / 2));
            zeitNachher = System.currentTimeMillis(); // Zeit nehmen
            dauer = zeitNachher - zeitVorher; // Dauer berechnen
            System.out.print(" - Rekursive Aufrufe: ");
            System.out.print(meinBinomialkoeffizient.getAufrufzaehler());
            if (dauer > 2) {
                System.out.print(" - Dauer: ");
                System.out.print(dauer + " millisec");
            }
            System.out.println();

            meinBinomialkoeffizient.resetAufrufzaehler();
        }
    }

}
