/** Una coda realizzata con un array circolare di capienza fissa. */
public class CodaArray<T>
        implements Coda<T> {

    private final Object[] elementi;
    private int testa;   // il primo
    private int coda;    // il prossimo
    private int quanti;

    public CodaArray(int capienza) {
        elementi = new Object[capienza];
        testa = 0;
        coda = 0;
        quanti = 0;
    }

    @Override
    public boolean isEmpty() {
        return quanti == 0;
    }

    @Override
    public boolean isFull() {
        return quanti == elementi.length;
    }

    @Override
    public void enqueue(T x) {
        if (isFull()) {
            throw new IllegalStateException("piena");
        }
        elementi[coda] = x;
        coda = (coda + 1) % elementi.length;
        quanti++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("vuota");
        }
        T x = (T) elementi[testa];
        testa = (testa + 1) % elementi.length;
        quanti--;
        return x;
    }
}
