/** Modulo: il massimo di un array, dalla lezione 11. */
public class Utili {

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
