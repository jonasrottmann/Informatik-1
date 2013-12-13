package uebung04;
public class Quersumme {
    public static int berechneQuersumme(long zahl) {
        int quersumme = 0;
        while (zahl > 0) {
            quersumme += zahl % 10;
            zahl = zahl / 10;
        }
        return quersumme;
    }
}