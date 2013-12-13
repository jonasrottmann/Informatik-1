package uebung02;
public class Aufgabe3_1 {
    public static void main(String[] args) {
        int zahl = 5;
        System.out.print("Die Zahl " + zahl + " ist eine Unzahl. ");
        System.out.print(PruefeAufUnzahl(zahl));
    }
    
    public static boolean PruefeAufUnzahl(int zahl){
        if(zahl > 4){
            return true;
        }else {
            return false;
        }
    }
}
