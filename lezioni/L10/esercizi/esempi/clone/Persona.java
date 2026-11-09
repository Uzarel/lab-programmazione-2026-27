/** Una persona clonabile, come nella lezione 8. */
public class Persona implements Cloneable {

    private final String nome;
    private final String cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public Persona clone()
            throws CloneNotSupportedException {
        return (Persona) super.clone();
    }

    @Override
    public String toString() {
        return nome + " " + cognome;
    }
}
