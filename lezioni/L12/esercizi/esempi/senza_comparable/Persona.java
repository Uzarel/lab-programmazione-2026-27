/** Una persona SENZA ordine naturale: non implementa Comparable. */
public class Persona {

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

    @Override
    public String toString() {
        return cognome + " " + nome
                + " (" + eta + ")";
    }
}
