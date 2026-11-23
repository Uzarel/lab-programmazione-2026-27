/** Una coda realizzata con una lista collegata: si toglie dalla
    testa, si aggiunge dopo l'ultimo nodo, raggiunto con `coda`. */
public class CodaLista<T>
        implements Coda<T> {

    private Nodo<T> testa;   // il primo
    private Nodo<T> coda;    // l'ultimo

    public CodaLista() {
        testa = null;
        coda = null;
    }

    @Override
    public void enqueue(T x) {
        Nodo<T> q = new Nodo<>(x);
        if (isEmpty()) {
            testa = q;           // il primo
        } else {
            coda.prossimo = q;   // dopo l'ultimo
        }
        coda = q;            // ora e' l'ultimo
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("vuota");
        }
        T x = testa.dato;
        testa = testa.prossimo;
        if (testa == null) {
            coda = null;   // era l'unico
        }
        return x;
    }

    @Override
    public boolean isEmpty() {
        return testa == null;
    }

    @Override
    public boolean isFull() {
        return false;            // mai piena
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
