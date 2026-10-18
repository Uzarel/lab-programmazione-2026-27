/** Un conto corrente bancario (la classe della lezione 5, con this). */
public class ContoBancario {

    private String intestatario;
    private double saldo;
    private int movimenti;   // operazioni riuscite

    /** Un conto vuoto. */
    public ContoBancario(String intestatario) {
        this.intestatario = intestatario;
        saldo = 0;
        movimenti = 0;
    }

    /** Un conto aperto con un primo versamento. */
    public ContoBancario(String intestatario,
                         double primo) {
        this(intestatario);
        versa(primo);
    }

    public String getIntestatario() {
        return intestatario;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getMovimenti() {
        return movimenti;
    }

    /** false se l'importo non e` positivo. */
    public boolean versa(double importo) {
        if (importo <= 0) {
            return false;
        }
        saldo += importo;
        movimenti++;
        return true;
    }

    /** false se l'importo non e` positivo
     *  o supera il saldo. */
    public boolean preleva(double importo) {
        if (importo <= 0 || importo > saldo) {
            return false;
        }
        saldo -= importo;
        movimenti++;
        return true;
    }

    /** false se altro e` questo stesso conto
     *  o se il prelievo fallisce. */
    public boolean trasferisci(ContoBancario altro,
                               double importo) {
        if (altro == this || !preleva(importo)) {
            return false;
        }
        altro.versa(importo);
        return true;
    }
}
