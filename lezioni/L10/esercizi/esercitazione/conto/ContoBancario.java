/** Un conto: errori con le eccezioni. */
public class ContoBancario {

    private final String intestatario;
    private double saldo;

    public ContoBancario(String intestatario) {
        this.intestatario = intestatario;
        saldo = 0;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public double getSaldo() {
        return saldo;
    }

    /** Versa importo, che deve essere > 0. */
    public void versa(double importo) {
        if (importo <= 0) {
            throw new IllegalArgumentException(
                    "non positivo: " + importo);
        }
        saldo += importo;
    }

    /** Preleva importo, se il saldo basta. */
    public void preleva(double importo)
            throws SaldoInsufficienteException {
        if (importo <= 0) {
            throw new IllegalArgumentException(
                    "non positivo: " + importo);
        }
        if (importo > saldo) {
            throw new SaldoInsufficienteException(
                    importo - saldo);
        }
        saldo -= importo;
    }

    /** Sposta importo su altro. */
    public void trasferisci(ContoBancario altro,
                            double importo)
            throws SaldoInsufficienteException {
        preleva(importo);
        altro.versa(importo);
    }

    @Override
    public String toString() {
        return intestatario + ": saldo " + saldo;
    }
}
