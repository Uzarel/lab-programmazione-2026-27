/** Una persona con la sua data di nascita. Versione senza privacy leak. */
public class Persona {

    private final String nome;
    private final Data nascita;

    public Persona(String nome, Data nascita) {
        this.nome = nome;
        this.nascita = new Data(nascita);   // copia
    }

    public String getNome() {
        return nome;
    }

    public Data getNascita() {
        return new Data(nascita);           // copia
    }
}
