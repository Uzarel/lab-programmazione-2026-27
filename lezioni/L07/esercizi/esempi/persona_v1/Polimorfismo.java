/** Upcasting, binding dinamico e array polimorfico. */
public class Polimorfismo {

    /** LEGGE la persona ricevuta e la stampa. */
    public static void stampa(Persona x) {
        System.out.println(x.descrizione());
    }

    public static void main(String[] args) {
        Persona p = new Studente("Luca", "Bianchi",
                "N86001234");   // upcasting
        System.out.println(p.getNome());
        System.out.println(p.descrizione());
        // p.getMatricola();   // ERRORE

        Persona[] elenco = {
            new Persona("Anna", "Russo"),
            new Studente("Luca", "Bianchi", "N86001234"),
            new Persona("Marco", "Esposito"),
            new Studente("Sara", "Greco", "N86005678")
        };
        for (Persona x : elenco) {
            stampa(x);
        }
    }
}
