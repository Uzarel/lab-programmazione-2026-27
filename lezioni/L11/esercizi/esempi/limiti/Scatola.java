/** Contiene un oggetto di tipo T. */
public class Scatola<T> {

    private T contenuto;

    public Scatola(T contenuto) {
        this.contenuto = contenuto;
    }

    public T getContenuto() {
        return contenuto;
    }

    public void setContenuto(T contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public String toString() {
        return "(" + contenuto + ")";
    }
}
