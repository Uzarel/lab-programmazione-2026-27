/** Una coppia ordinata di valori, di tipo A e B. */
public class Coppia<A, B> {

    private final A primo;
    private final B secondo;

    public Coppia(A primo, B secondo) {
        this.primo = primo;
        this.secondo = secondo;
    }

    public A getPrimo() {
        return primo;
    }

    public B getSecondo() {
        return secondo;
    }

    /** La coppia con i due valori scambiati. */
    public Coppia<B, A> scambia() {
        return new Coppia<>(secondo, primo);
    }

    @Override
    public String toString() {
        return "(" + primo + ", " + secondo + ")";
    }
}
