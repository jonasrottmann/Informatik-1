package uebung08;
public class Main {

    public static void main(String[] args) {
        Binomialkoeffizient meinBinomialkoeffizient = new Binomialkoeffizient();
        long zeitVorher;
        long zeitNachher;
        long dauer;
        
        for (int i = 0; i <= 30; i++) {
            System.out.print("i: ");
            System.out.print(i);
            System.out.print(" - Binomialkoeffizient: ");
            zeitVorher = System.currentTimeMillis();
            System.out.print(meinBinomialkoeffizient.getBinomialKoeffizient(i, i / 2));
            zeitNachher = System.currentTimeMillis();
            dauer = zeitNachher - zeitVorher;
            System.out.print(" - Rekursive Aufrufe: ");
            System.out.print(meinBinomialkoeffizient.getAufrufzaehler());
            if(dauer > 2){
                System.out.print(" - Dauer: ");
                System.out.print(dauer + " millisec");
            }
            System.out.println();
            
            meinBinomialkoeffizient.resetAufrufzaehler();
        }
    }

}
