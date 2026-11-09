/** Un parcheggio con un numero fisso di posti. */
public class Parcheggio {

    private final String nome;
    private final int posti;
    private int occupati;

    public Parcheggio(String nome, int posti) {
        this.nome = nome;
        this.posti = posti;
        occupati = 0;
    }

    /** Occupa un posto libero. */
    public void entra()
            throws ParcheggioPienoException {
        if (occupati == posti) {
            throw new ParcheggioPienoException();
        }
        occupati++;
    }

    @Override
    public String toString() {
        return nome + ": " + occupati + "/" + posti;
    }
}
