import java.util.Objects;

/** Uno studente E` UNA persona con matricola. */
public class Studente extends Persona {

    private final String matricola;

    public Studente(String nome, String cognome, String matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    public String getMatricola() {
        return matricola;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", matricola " + matricola;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Studente s = (Studente) obj;
        return matricola.equals(s.matricola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                matricola);
    }
}
