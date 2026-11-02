package contabilita;

/** Un pagabile che si puo` pagare a rate. */
public interface Rateizzabile extends Pagabile {

    int numeroRate();  // public abstract

    default double rata() {
        return importo() / numeroRate();
    }
}
