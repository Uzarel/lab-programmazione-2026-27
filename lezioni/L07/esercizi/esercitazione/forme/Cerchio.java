/** Un cerchio E` UNA forma. */
public class Cerchio extends Forma {

    private final double raggio;

    /** Un raggio non positivo diventa 1. */
    public Cerchio(String colore,
                   double raggio) {
        super(colore);
        if (raggio > 0) {
            this.raggio = raggio;
        } else {
            this.raggio = 1;
        }
    }

    public double getRaggio() {
        return raggio;
    }

    @Override
    public double area() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raggio;
    }

    @Override
    public String descrizione() {
        return "cerchio " + getColore()
                + ", raggio " + raggio;
    }
}
