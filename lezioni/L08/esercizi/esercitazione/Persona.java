import java.util.Objects;

/** Una persona e il suo indirizzo. */
public class Persona implements Cloneable {

    private final String nome;
    private final String cognome;
    private Indirizzo indirizzo;   // non final

    public Persona(String nome, String cognome,
                   String via, String citta) {
        this.nome = nome;
        this.cognome = cognome;
        indirizzo = new Indirizzo(via, citta);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCitta() {
        return indirizzo.getCitta();
    }

    /** MODIFICA: cambia citta`. */
    public void trasferisci(String citta) {
        indirizzo.setCitta(citta);
    }

    @Override
    public String toString() {
        return nome + " " + cognome
                + ", " + indirizzo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Persona altra = (Persona) obj;
        return nome.equals(altra.nome)
                && cognome.equals(altra.cognome)
                && indirizzo.equals(altra.indirizzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome,
                indirizzo);
    }

    @Override
    public Persona clone()
            throws CloneNotSupportedException {
        // 1. copia superficiale
        Persona c = (Persona) super.clone();
        // 2. profonda: anche l'indirizzo
        c.indirizzo = indirizzo.clone();
        return c;
    }
}
