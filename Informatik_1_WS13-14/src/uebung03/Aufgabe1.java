package uebung03;
public class Aufgabe1 {
    public static void main(String[] args) {
        int tag = 1;
        int monat = 1;
        int jahr = 1904;
        String wochentag;

        switch (bestimmeWochentag(tag, monat, jahr)) {
            case 0:
                wochentag = "Sonntag";
                break;
            case 1:
                wochentag = "Montag";
                break;
            case 2:
                wochentag = "Dienstag";
                break;
            case 3:
                wochentag = "Mittwoch";
                break;
            case 4:
                wochentag = "Donnerstag";
                break;
            case 5:
                wochentag = "Freitag";
                break;
            case 6:
                wochentag = "Samstag";
                break;
            default:
                wochentag = "";
        }

        // Ausgabe
        System.out.println("Der " + tag + "." + monat + "." + jahr + " ist ein " + wochentag + ".");
    }

    public static boolean pruefeAufSchaltjahr(int jahreszahl) {
        return (jahreszahl % 4 == 0 && jahreszahl % 100 != 0) || jahreszahl % 400 == 0;
    }

    public static int bestimmeWochentag(int tag, int monat, int jahr) {
        int tageSeit1990;

        tageSeit1990 = (jahr - 1900) * 365; // Vom gegebenen Jahr 1900 abziehen und dies mit 365 multiplizieren
        tageSeit1990 += (jahr - 1900) / 4; // Die fehlenden Schalttage hinzuaddieren
        if (pruefeAufSchaltjahr(jahr) && monat <= 2) {
            tageSeit1990 -= 1; // Wenn das gegebene Jahr ein Schaltjahr ist, eins abziehen
        }

        switch (monat - 1) { // Pro Monat die Anzahl von Tagen hinzuaddieren
            case 11:
                tageSeit1990 += 30; // November
            case 10:
                tageSeit1990 += 31; // Oktober
            case 9:
                tageSeit1990 += 30; // September
            case 8:
                tageSeit1990 += 31; // August
            case 7:
                tageSeit1990 += 31; // Juli
            case 6:
                tageSeit1990 += 30; // Juni
            case 5:
                tageSeit1990 += 31; // Mai
            case 4:
                tageSeit1990 += 30; // April
            case 3:
                tageSeit1990 += 31; // M??rz
            case 2:
                tageSeit1990 += 28; // Februar
            case 1:
                tageSeit1990 += 31; // Januar
        }
        tageSeit1990 += tag; // Den gegebenen Tag hinzuaddieren

        return tageSeit1990 % 7;
    }
}
