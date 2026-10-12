/** Un conto corrente bancario. */
public class ContoBancario {

    private String intestatario;
    private double saldo;
    private int movimenti;   // operazioni riuscite

    /** Un conto vuoto. */
    public ContoBancario(String nome) {
        intestatario = nome;
        saldo = 0;
        movimenti = 0;
    }

    /** Un conto aperto con un primo versamento. */
    public ContoBancario(String nome, double primo) {
        intestatario = nome;
        saldo = 0;
        movimenti = 0;
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

    /** false se il prelievo da questo conto fallisce. */
    public boolean trasferisci(ContoBancario altro, double importo) {
        if (!preleva(importo)) {
            return false;
        }
        altro.versa(importo);
        return true;
    }
}
