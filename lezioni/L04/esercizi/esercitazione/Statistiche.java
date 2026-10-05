import java.util.Arrays;

/**
 * Modulo: statistiche su sequenze di interi.
 * Tutti i metodi LEGGONO gli argomenti.
 * Precondizione comune: almeno un valore.
 */
public class Statistiche {

    public static int somma(int... v) {
        int s = 0;
        for (int x : v) {
            s += x;
        }
        return s;
    }

    public static double media(int... v) {
        return (double) somma(v) / v.length;
    }

    public static int minimo(int... v) {
        int min = v[0];
        for (int x : v) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public static int massimo(int... v) {
        int max = v[0];
        for (int x : v) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    /** Il valore centrale dei dati ordinati. */
    public static double mediana(int... v) {
        int[] o = ordinata(v);
        int meta = o.length / 2;
        if (o.length % 2 == 1) {
            return o[meta];   // int -> double
        }
        return (o[meta - 1] + o[meta]) / 2.0;
    }

    // corpo: CREA una copia ordinata di v
    private static int[] ordinata(int[] v) {
        int[] copia = Arrays.copyOf(v, v.length);
        Arrays.sort(copia);
        return copia;
    }
}
