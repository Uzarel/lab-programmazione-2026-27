package contabilita;

/** Qualcosa che va pagato: ha un importo. */
public interface Pagabile {

    double importo();  // public abstract

    static double totale(Pagabile[] elenco) {
        double somma = 0;
        for (Pagabile p : elenco) {
            somma += p.importo();
        }
        return somma;
    }
}
