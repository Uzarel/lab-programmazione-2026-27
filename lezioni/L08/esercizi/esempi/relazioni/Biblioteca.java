/** Biblioteca HA DEI libri: aggregazione. */
public class Biblioteca {

    private final String nome;
    private final Libro[] libri;   // ricevuti
    private int quanti;

    public Biblioteca(String nome, int max) {
        this.nome = nome;
        libri = new Libro[max];
        quanti = 0;
    }

    public int getQuanti() {
        return quanti;
    }

    /** MODIFICA: false se e` piena. */
    public boolean aggiungi(Libro l) {
        if (quanti == libri.length) {
            return false;
        }
        libri[quanti] = l;
        quanti++;
        return true;
    }

    @Override
    public String toString() {
        String s = nome + ", libri: " + quanti;
        for (int i = 0; i < quanti; i++) {
            s += "\n  " + libri[i];
        }
        return s;
    }
}
