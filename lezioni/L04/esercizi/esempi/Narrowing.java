public class Narrowing {
    public static void main(String[] args) {
        double prezzo = 9.99;
        int euro = (int) prezzo;            // 9: tronca
        int vicino = (int) (prezzo + 0.5);  // 10
        System.out.println(euro + " " + vicino);
        System.out.println((int) -9.99);    // -9

        int somma = 59;
        int n = 6;
        System.out.println(somma / n);             // 9
        System.out.println((double) somma / n);    // 9.83...
        System.out.println((double) (somma / n));  // 9.0

        System.out.println((int) 3e10);     // 2147483647
        char strano = (char) 2000000000;
        System.out.println((int) strano);   // 37888
    }
}
