/** Una persona con la sua data di nascita. Versione con privacy leak. */
public class Persona {

    private final String nome;
    private final Data nascita;

    public Persona(String nome, Data nascita) {
        this.nome = nome;
        this.nascita = nascita;
    }

    public String getNome() {
        return nome;
    }

    public Data getNascita() {
        return nascita;
    }
}
