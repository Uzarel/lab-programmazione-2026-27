/** Composizione e aggregazione all'opera. */
public class ProvaRelazioni {

    public static void main(String[] args) {
        // composizione: il motore nasce dentro l'auto
        Auto a = new Auto("AB123CD", 1200);
        a.accendi();
        System.out.println(a);

        // aggregazione: i libri nascono fuori e sono condivisi
        Libro l1 = new Libro("Programmare in Java",
                "Deitel");
        Libro l2 = new Libro("Effective Java",
                "Bloch");
        Biblioteca b1 = new Biblioteca("Civica", 2);
        Biblioteca b2 = new Biblioteca("DIETI", 10);
        b1.aggiungi(l1);
        b1.aggiungi(l2);
        b2.aggiungi(l1);
        System.out.println(b1);
    }
}
