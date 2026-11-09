/** Sollevata se il saldo non basta. */
public class SaldoInsufficienteException
        extends Exception {

    private final double mancante;

    public SaldoInsufficienteException(
            double mancante) {
        super("saldo insufficiente, mancano "
                + mancante + " euro");
        this.mancante = mancante;
    }

    public double getMancante() {
        return mancante;
    }
}
