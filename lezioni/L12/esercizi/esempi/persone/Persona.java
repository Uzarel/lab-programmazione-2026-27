/** Una persona con nome, cognome ed eta'; l'ordine naturale e' per eta'. */
public class Persona
        implements Comparable<Persona> {

    private final String nome;
    private final String cognome;
    private final int eta;

    public Persona(String nome, String cognome,
                   int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    /** Negativo se this e' piu' giovane. */
    @Override
    public int compareTo(Persona altra) {
        return Integer.compare(eta, altra.eta);
    }

    @Override
    public String toString() {
        return cognome + " " + nome
                + " (" + eta + ")";
    }
}
