/** L'ADT coda (queue): politica FIFO. */
public interface Coda<T> {

    /** Mette x in fondo. Pre: !isFull(). */
    void enqueue(T x);

    /** Toglie e restituisce il primo.
        Pre: !isEmpty(). */
    T dequeue();

    boolean isEmpty();

    boolean isFull();
}
