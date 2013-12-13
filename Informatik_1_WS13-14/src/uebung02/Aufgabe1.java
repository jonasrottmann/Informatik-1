package uebung02;
public class Aufgabe1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = 1 % 7 + 8 / 16 * 2;
        // = 1 + ((0) * 2)
        // = 1 + 0
        // = 1
        System.out.println("a) " + a);

        double b = 1 % 7 + 8.0 / 16 * 2;
        // = 1 + 1.0
        // = 2.0
        System.out.println("b) " + b);
        
        boolean c = false & false | true;
        // = false | true
        System.out.println("c) " + c);
        
        boolean d = false && false | true;
        // = false && (false | true)
        // = false && true
        // = false
        System.out.println("d) " + d);
        
        boolean e = true ^ false & false;
        // = true ^ (false & false)
        // = true ^ (false)
        // = true
        System.out.println("e) " + e);
        
        boolean f = true ^ false && false;
        // = (true ^ false) & false
        // = true & false
        // = false
        System.out.println("f) " + f);
    }
}
