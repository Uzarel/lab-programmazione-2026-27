/** Una pila realizzata con una lista collegata: la cima e' la testa. */
public class PilaLista<T>
        implements Pila<T> {

    private Nodo<T> testa;   // null se vuota

    public PilaLista() {
        testa = null;
    }

    @Override
    public boolean isEmpty() {
        return testa == null;
    }

    @Override
    public boolean isFull() {
        return false;        // mai piena
    }

    @Override
    public void push(T x) {
        Nodo<T> q = new Nodo<>(x);
        q.prossimo = testa;
        testa = q;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("vuota");
        }
        T x = testa.dato;
        testa = testa.prossimo;
        return x;
    }
}
