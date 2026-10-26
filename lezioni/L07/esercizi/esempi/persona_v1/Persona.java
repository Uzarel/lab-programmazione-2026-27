/** Una persona: nome e cognome. */
public class Persona {

    private final String nome;
    private final String cognome;

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
