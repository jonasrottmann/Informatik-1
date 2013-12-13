package uebung04;
public class HarshadZahlen {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % Quersumme.berechneQuersumme(i) == 0) {
                System.out.println(i);
            }
        }
    }
}