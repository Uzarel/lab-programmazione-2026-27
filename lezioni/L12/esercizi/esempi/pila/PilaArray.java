/** Una pila realizzata con un array di capienza fissa. */
public class PilaArray<T>
        implements Pila<T> {

    // non T[] (lezione 11)
    private final Object[] elementi;
    // prima posizione libera
    private int cima;

    public PilaArray(int capienza) {
        elementi = new Object[capienza];
        cima = 0;
    }

    @Override
    public boolean isEmpty() {
        return cima == 0;
    }

    @Override
    public boolean isFull() {
        return cima == elementi.length;
    }

    @Override
    public void push(T x) {
        if (isFull()) {
            throw new IllegalStateException("piena");
        }
        elementi[cima] = x;
        cima++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("vuota");
        }
        cima--;
        return (T) elementi[cima];
    }
}
