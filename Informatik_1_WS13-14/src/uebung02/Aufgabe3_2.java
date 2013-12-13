package uebung02;
public class Aufgabe3_2 {
    public static void main(String[] args) {
        int zahl = 128;
        System.out.print("Die Zahl " + zahlUmbennen(zahl) + " ist eine Unzahl. ");
        System.out.print(pruefeAufUnzahl(zahl));
    }
    
    public static String zahlUmbennen(int zahl){
        if(zahl==8){
            return "Doppelvier (8)";
        }else if(zahl == 16){
            return "Doppeldoppelvier (16)";
        }else if(zahl == 32){
            return "Doppeldoppeldoppelvier (32)";
        }else if(zahl == 64){
            return "Doppeldoppeldoppeldoppelvier (64)";
        }else if(zahl == 128){
            return "Doppeldoppeldoppeldoppeldoppelvier (128)";
        }else{
            return zahl+""; //int zahl zu String
        }
    }
    
    public static boolean pruefeAufUnzahl(int zahl){
        if(1 <= zahl & zahl <= 4){ //Pr??fe Zahl 1 bis 4 
            return false;
        }else{
            if(zahl % 4 == 0){
                return false;
            }else {
                return true;
            }
        }
    }
}
