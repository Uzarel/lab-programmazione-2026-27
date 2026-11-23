/** L'ADT pila (stack): politica LIFO. */
public interface Pila<T> {

    /** Mette x in cima. Pre: !isFull(). */
    void push(T x);

    /** Toglie e restituisce la cima.
        Pre: !isEmpty(). */
    T pop();

    boolean isEmpty();

    boolean isFull();
}
