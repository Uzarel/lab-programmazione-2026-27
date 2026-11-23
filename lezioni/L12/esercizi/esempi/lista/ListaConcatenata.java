/** Una lista concatenata (linked list) di elementi di tipo T. */
public class ListaConcatenata<T> {

    private Nodo<T> testa;   // null se vuota

    public ListaConcatenata() {
        testa = null;
    }

    public boolean isEmpty() {
        return testa == null;
    }

    /** Inserisce x come primo elemento. */
    public void addFirst(T x) {
        Nodo<T> q = new Nodo<>(x);
        q.prossimo = testa;
        testa = q;
    }

    /** Inserisce x come ultimo elemento. */
    public void addLast(T x) {
        Nodo<T> q = new Nodo<>(x);
        if (isEmpty()) {
            testa = q;
        } else {
            Nodo<T> temp = testa;
            while (temp.prossimo != null) {
                temp = temp.prossimo;
            }
            temp.prossimo = q;
        }
    }

    /** Toglie e restituisce il primo.
        Pre: !isEmpty(). */
    public T removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("vuota");
        }
        T x = testa.dato;
        testa = testa.prossimo;
        return x;
    }

    /** Toglie la prima x; vero se c'era. */
    public boolean remove(T x) {
        if (isEmpty()) {
            return false;
        }
        if (testa.dato.equals(x)) {
            testa = testa.prossimo;   // era in testa
            return true;
        }
        Nodo<T> temp = testa;         // nodo prima di x
        while (temp.prossimo != null
                && !temp.prossimo.dato.equals(x)) {
            temp = temp.prossimo;
        }
        if (temp.prossimo == null) {
            return false;             // x non c'e'
        }
        temp.prossimo = temp.prossimo.prossimo;
        return true;
    }

    @Override
    public String toString() {
        String s = "[";
        Nodo<T> temp = testa;
        while (temp != null) {
            s += temp.dato;
            if (temp.prossimo != null) {
                s += ", ";
            }
            temp = temp.prossimo;
        }
        return s + "]";
    }
}
