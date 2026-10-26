/** Downcasting: dal riferimento alla superclasse a quello alla sottoclasse. */
public class Downcast {

    public static void main(String[] args) {
        Persona p = new Studente("Luca", "Bianchi",
                "N86001234");
        Persona q = new Persona("Anna", "Russo");

        // Studente s = p;   // ERRORE: serve il cast
        Studente s = (Studente) p;   // ok: Studente
        System.out.println(s.getMatricola());

        Studente t = (Studente) q;   // compila, ma...
        System.out.println(t.getMatricola());
    }
}
