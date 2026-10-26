/** Una persona: nome e cognome. Versione 2: protected. */
public class Persona {

    protected final String nome;
    protected final String cognome;

    public Persona(String nome,
                   String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String descrizione() {
        return nome + " " + cognome;
    }
}
