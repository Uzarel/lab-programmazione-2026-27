/** Tre problemi risolti per ricorsione. */
public class Ricorsivi {

    private static int chiamate = 0;

    /** La somma delle cifre di n, n >= 0. */
    public static int sommaCifre(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sommaCifre(n / 10);
    }

    /** Stampa v[i], v[i+1], ... in ordine inverso. */
    public static void stampaInversa(int[] v, int i) {
        if (i < v.length) {
            stampaInversa(v, i + 1);
            System.out.print(v[i] + " ");
        }
    }

    /** Stampa tutto v al contrario: parte da 0. */
    public static void stampaInversa(int[] v) {
        stampaInversa(v, 0);
        System.out.println();
    }

    /** L'n-esimo numero di Fibonacci. */
    public static int fibonacci(int n) {
        chiamate++;
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(sommaCifre(1234));
        int[] v = { 3, 8, 1, 6 };
        stampaInversa(v);
        System.out.println(fibonacci(20));
        System.out.println(chiamate + " chiamate");
    }
}
