import java.util.Objects;

/** Una persona: nome e cognome (versione 4: i metodi di Object ridefiniti). */
public class Persona implements Cloneable {

    private final String nome;
    private final String cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    @Override
    public String toString() {
        return nome + " " + cognome;
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
                && cognome.equals(altra.cognome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome);
    }

    @Override
    public Persona clone()
            throws CloneNotSupportedException {
        return (Persona) super.clone();
    }
}
