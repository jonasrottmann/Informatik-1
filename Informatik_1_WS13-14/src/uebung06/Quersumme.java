package uebung06;
public class Quersumme {
    public int berechneQuersumme(long zahl) {
        int quersumme = 0;
        while (zahl > 0) {
            quersumme += zahl % 10;
            zahl = zahl / 10;
        }
        return quersumme;
    }
}