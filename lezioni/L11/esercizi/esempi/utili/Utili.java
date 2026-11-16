/** Modulo: metodi generici su array. */
public class Utili {

    /** Il primo elemento di v, non vuoto. */
    public static <T> T primo(T[] v) {
        return v[0];
    }

    /** Scambia v[i] e v[j]. */
    public static <T> void scambia(T[] v,
                                   int i, int j) {
        T t = v[i];
        v[i] = v[j];
        v[j] = t;
    }

    /** Il massimo di v, non vuoto. */
    public static <T extends Comparable<T>>
            T max(T[] v) {
        T m = v[0];
        for (T x : v) {
            if (x.compareTo(m) > 0) {
                m = x;
            }
        }
        return m;
    }
}
