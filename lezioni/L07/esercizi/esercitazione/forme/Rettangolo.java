/** Un rettangolo E` UNA forma. */
public class Rettangolo extends Forma {

    private final double base;
    private final double altezza;

    /** Un lato non positivo diventa 1. */
    public Rettangolo(String colore, double base,
                      double altezza) {
        super(colore);
        if (base > 0) {
            this.base = base;
        } else {
            this.base = 1;
        }
        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            this.altezza = 1;
        }
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public boolean isQuadrato() {
        return base == altezza;
    }

    @Override
    public double area() {
        return base * altezza;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altezza);
    }

    @Override
    public String descrizione() {
        return "rettangolo " + getColore()
                + " " + base + " x " + altezza;
    }
}
