/** getClass e instanceof: la classe dell'oggetto a tempo di esecuzione. */
public class ProvaInstanceof {

    /** LEGGE x: se porta a uno studente,
     *  ne stampa la matricola. */
    public static void stampaMatricola(Persona x) {
        if (x instanceof Studente) {
            Studente s = (Studente) x;  // sicuro
            System.out.println(s.getMatricola());
        } else {
            System.out.println("nessuna");
        }
    }

    public static void main(String[] args) {
        Persona p = new Persona("Anna", "Russo");
        Persona q = new Studente("Luca", "Bianchi",
                "N86001234");

        System.out.println(p.getClass());
        System.out.println(q.getClass());

        System.out.println(q instanceof Studente);
        System.out.println(q instanceof Persona);

        stampaMatricola(p);
        stampaMatricola(q);
    }
}
