/** Una fattura: quantita` per prezzo. */
public class Fattura implements Pagabile {

    private final String numero;
    private final int quantita;
    private final double prezzo;

    public Fattura(String numero, int quantita,
                   double prezzo) {
        this.numero = numero;
        this.quantita = quantita;
        this.prezzo = prezzo;
    }

    @Override
    public double importo() {
        return quantita * prezzo;
    }

    @Override
    public String toString() {
        return "fattura " + numero;
    }
}
