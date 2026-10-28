/** Una persona: nome e cognome (versione 3: equals in overload). */
public class Persona {

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

    public String descrizione() {
        return nome + " " + cognome;
    }

    /** true se altra ha lo stesso nome e cognome (overload, lezione 6). */
    public boolean equals(Persona altra) {
        return nome.equals(altra.nome)
                && cognome.equals(altra.cognome);
    }
}
