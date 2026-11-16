import java.util.Arrays;

/** Elementi di tipo T, senza limite di capienza. */
public class Contenitore<T> {

    private Object[] elementi;   // non T[]
    private int quanti;

    public Contenitore() {
        elementi = new Object[4];
        quanti = 0;
    }

    /** Aggiunge x in coda; raddoppia se pieno. */
    public void aggiungi(T x) {
        if (quanti == elementi.length) {
            elementi = Arrays.copyOf(elementi,
                    2 * elementi.length);
        }
        elementi[quanti] = x;
        quanti++;
    }

    /** L'elemento i-esimo, 0 <= i < size(). */
    public T get(int i) {
        if (i < 0 || i >= quanti) {
            throw new IllegalArgumentException(
                    "indice non valido: " + i);
        }
        return (T) elementi[i];
    }

    /** Quanti elementi contiene. */
    public int size() {
        return quanti;
    }

    /** La prima posizione di x, o -1. */
    public int indiceDi(T x) {
        for (int i = 0; i < quanti; i++) {
            if (elementi[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    /** Vero se x e' nel contenitore. */
    public boolean contiene(T x) {
        return indiceDi(x) != -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(
                Arrays.copyOf(elementi, quanti));
    }
}
