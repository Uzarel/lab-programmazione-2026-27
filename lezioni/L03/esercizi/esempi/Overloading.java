/* Lezione 3 -- Overloading: stesso nome, firme diverse. */
public class Overloading {

    public static int quadrato(int x) {
        System.out.print("[quadrato(int)]    ");
        return x * x;
    }

    public static double quadrato(double x) {
        System.out.print("[quadrato(double)] ");
        return x * x;
    }

    public static void stampa(int x) {
        System.out.println("int: " + x);
    }

    public static void stampa(double x) {
        System.out.println("double: " + x);
    }

    public static void stampa(String s) {
        System.out.println("String: " + s);
    }

    // public static double quadrato(int x) { ... }   // ERRORE: stessa firma di quadrato(int)

    public static void main(String[] args) {
        System.out.println(quadrato(3));      // 9
        System.out.println(quadrato(3.5));    // 12.25

        stampa(42);          // int
        stampa(4.2);         // double
        stampa("42");        // String

        char c = 'A';
        stampa(c);           // nessuna stampa(char): char -> int
        stampa(3.14f);       // nessuna stampa(float): float -> double
    }
}
