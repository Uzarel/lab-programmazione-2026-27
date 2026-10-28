/** Un libro: titolo e autore. Esiste anche fuori da una biblioteca. */
public class Libro {

    private final String titolo;
    private final String autore;

    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    @Override
    public String toString() {
        return titolo + " (" + autore + ")";
    }
}
