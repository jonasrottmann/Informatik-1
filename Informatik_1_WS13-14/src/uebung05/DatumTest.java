package uebung05;
public class DatumTest {

    public static void main(String[] args) {
        Datum testDatum1 = new Datum(22, 3, 1900);
        Datum testDatum2 = new Datum(29, 2, 2013);
        Datum testDatum3 = new Datum(29, 2, 2012);
        Datum testDatum4 = new Datum(1, 1, 1);
        Datum testDatum5 = new Datum(1, 1, 0);
        Datum testDatum6 = new Datum(1, 1, 1900);
        Datum testDatum7 = new Datum(0, 1, 1900);
        Datum testDatum8 = new Datum(1, 0, 1900);
    }
}
