package contabilita;

/** Una fattura: a rate e stampabile. */
public class Fattura
        implements Rateizzabile, Stampabile {

    private final String numero;
    private final int quantita;
    private final double prezzo;
    private final int rate;    // in piu`

    public Fattura(String numero, int quantita,
                   double prezzo, int rate) {
        this.numero = numero;
        this.quantita = quantita;
        this.prezzo = prezzo;
        this.rate = rate;
    }

    @Override
    public double importo() {
        return quantita * prezzo;
    }

    @Override
    public int numeroRate() {
        return rate;
    }

    @Override
    public void stampa() {
        System.out.println("FATTURA n. " + numero);
        System.out.println("totale " + importo()
                + " in " + rate + " rate");
    }

    @Override
    public String toString() {
        return "fattura " + numero;
    }
}
