package uebung06;

public class Datum {
    private int tag;
    private int monat;
    private int jahr;

    /**
     * Konstruktor: Gibt das Datum als String aus.
     * 
     * @param tag
     * @param monat
     * @param jahr
     */
    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
        System.out.println(toString());
    }

    /**
     * Prüft ob ein korrektes Datum eingegeben wurde. Ein Datum ist korrekt,
     * wenn das jahr größerer als 0 ist, der monat zwischen 1 und 12, und der tag
     * nicht größer als die Tage, die der jeweilige Monat besitzt, ist.
     * 
     * @return true für ein korrektes Datum
     */
    public boolean isKorrekt() {

//        int[] monate = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        if(isSchaltjahr()){
//            monate[1]=29;
//        }
//        if(monat > 0 && monat < 13 && jahr > 0 && tag > 0 && tag <= monate[monat-1]){
//            return true;
//        }
//        return false;
        
        
        if (monat == 1 | monat == 3 | monat == 5 | monat == 7 | monat == 8 | monat == 10 | monat == 12) {
            //Januar, M??rz, Mai, Juli, August, Oktober, Dezember
            if (jahr >= 0 && tag > 0 && tag < 32) {
                return true;
            }
            return false;
        } else if (monat == 2) {
            //Februar
            if (isSchaltjahr()) {
                if (jahr >= 0 && tag > 0 && tag < 30) {
                    return true;
                }
                return false;
            } else {
                if (jahr >= 0 && tag > 0 && tag < 29) {
                    return true;
                }
                return false;
            }
        } else if (monat == 4 | monat == 6 | monat == 9 | monat == 11) {
            //April, Juni, September, November
            if (jahr >= 0 && tag > 0 && tag < 31) {
                return true;
            }
            return false;
        }else{
            return false;
        }
        
    }

    /**
     * Gibt den Tag des Datums zurück. Wenn kein korrektes Datum eingegeben
     * wurde -1.
     * 
     * @return tag
     */
    public int getTag() {
        if (isKorrekt()) {
            return tag;
        } else {
            return -1;
        }
    }

    /**
     * Gibt den Monat des Datums zurück. Wenn kein korrektes Datum eingegeben
     * wurde -1.
     * 
     * @return monat
     */
    public int getMonat() {
        if (isKorrekt()) {
            return monat;
        } else {
            return -1;
        }
    }

    /**
     * Gibt das Jahr des Datums zurück. Wenn kein korrektes Datum eingegeben
     * wurde -1.
     * 
     * @return tag
     */
    public int getJahr() {
        if (isKorrekt()) {
            return jahr;
        } else {
            return -1;
        }
    }

    /**
     * Pr??ft ob das eingebene jahr ein Schaltjahr ist.
     * 
     * @return true, wenn es ein Schaltjahr ist
     */
    public boolean isSchaltjahr() {
        if ((jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gibt das Datum als String der Form "1. Januar 1990 / Schaltjahr" oder
     * "1. Januar 1901 / kein Schaltjahr" zurück.
     * 
     * @return Datum als String
     */
    public String toString() {
        if (isKorrekt()) {
            String schaltjahrString;
            String monatString;

            if (isSchaltjahr()) {
                schaltjahrString = "Schaltjahr";
            } else {
                schaltjahrString = "kein Schaltjahr";
            }
            switch (monat) {
                case 1:
                    monatString = "Januar";
                    break;
                case 2:
                    monatString = "Febraur";
                    break;
                case 3:
                    monatString = "März";
                    break;
                case 4:
                    monatString = "April";
                    break;
                case 5:
                    monatString = "Mai";
                    break;
                case 6:
                    monatString = "Juni";
                    break;
                case 7:
                    monatString = "Juli";
                    break;
                case 8:
                    monatString = "August";
                    break;
                case 9:
                    monatString = "September";
                    break;
                case 10:
                    monatString = "Oktober";
                    break;
                case 11:
                    monatString = "November";
                    break;
                default:
                    monatString = "Dezember";
                    break;
            }

            return tag + ". " + monatString + " " + jahr + " / " + schaltjahrString;
        } else {
            return "ungültiges Datum";
        }
    }
}