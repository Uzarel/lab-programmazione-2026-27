/** Programma di prova per la classe Studente. */
public class ProvaStudente {

    /** LEGGE lo studente ricevuto e lo stampa. */
    public static void stampa(Studente s) {
        System.out.println(s.getNome()
                + ": esami " + s.getEsami()
                + ", media " + s.media());
    }

    public static void main(String[] args) {
        Studente a = new Studente("Giulia", "N46001234");
        a.registra(28);
        a.registra(24);
        System.out.println(a.registra(31));
        stampa(a);

        Studente b = a;
        Studente c = new Studente(a);
        b.registra(29);
        c.registra(26);
        c.setNome("Giulia Russo");
        stampa(a);
        stampa(b);
        stampa(c);
    }
}
