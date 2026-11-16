/** Modulo: ricerca binaria su array ordinati di tipo confrontabile. */
public class Ricerche {

    /** Vero se v e' in ordine non decrescente. */
    public static <T extends Comparable<T>>
            boolean isOrdinato(T[] v) {
        for (int i = 1; i < v.length; i++) {
            if (v[i - 1].compareTo(v[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    /** L'indice di x in v (ordinato). */
    public static <T extends Comparable<T>>
            int ricercaBinaria(T[] v, T x)
            throws NonTrovatoException {
        int sinistra = 0;
        int destra = v.length - 1;
        while (sinistra <= destra) {
            int medio = (sinistra + destra) / 2;
            int c = v[medio].compareTo(x);
            if (c == 0) {
                return medio;
            } else if (c > 0) { // v[medio] dopo x
                destra = medio - 1;
            } else {
                sinistra = medio + 1;
            }
        }
        throw new NonTrovatoException(x);
    }

    /** Cerca x in v[sinistra..destra]. */
    public static <T extends Comparable<T>>
            int ricercaRicorsiva(T[] v, T x,
                    int sinistra, int destra)
            throws NonTrovatoException {
        if (sinistra > destra) {
            throw new NonTrovatoException(x);
        }
        int medio = (sinistra + destra) / 2;
        int c = v[medio].compareTo(x);
        if (c == 0) {
            return medio;
        } else if (c > 0) {
            return ricercaRicorsiva(v, x,
                    sinistra, medio - 1);
        } else {
            return ricercaRicorsiva(v, x,
                    medio + 1, destra);
        }
    }

    /** Cerca x in tutto v (ordinato). */
    public static <T extends Comparable<T>>
            int ricercaRicorsiva(T[] v, T x)
            throws NonTrovatoException {
        return ricercaRicorsiva(v, x,
                0, v.length - 1);
    }
}
