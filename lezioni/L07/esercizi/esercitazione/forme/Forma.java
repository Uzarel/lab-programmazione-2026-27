/** Una forma piana, con un colore. Astratta:
 *  esistono solo cerchi, rettangoli... */
public abstract class Forma {

    private final String colore;

    public Forma(String colore) {
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    /** Ogni forma la calcola a modo suo. */
    public abstract double area();

    public abstract double perimetro();

    /** true se ha area maggiore di altra. */
    public boolean piuGrandeDi(Forma altra) {
        return area() > altra.area();
    }

    public String descrizione() {
        return "forma " + colore;
    }
}
