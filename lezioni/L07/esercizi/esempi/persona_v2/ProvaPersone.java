/** Prova della versione 2: protected si vede nelle sottoclassi
 *  e nelle classi della stessa cartella (stesso package, lezione 9). */
public class ProvaPersone {

    public static void main(String[] args) {
        Studente s = new Studente("Luca", "Bianchi", "N86001234");
        System.out.println(s.descrizione());    // Luca Bianchi, matricola N86001234
        System.out.println(s.nome);   // compila: stessa cartella
    }
}
