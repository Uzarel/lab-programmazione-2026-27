/** Uno studente E` UNA persona con matricola. Versione 2. */
public class Studente extends Persona {

    private final String matricola;

    public Studente(String nome,
                    String cognome,
                    String matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    public String getMatricola() {
        return matricola;
    }

    @Override
    public String descrizione() {
        // lecito: nome e cognome sono protected
        return nome + " " + cognome
                + ", matricola " + matricola;
    }
}
