/** Il carattere jolly ? (con la Scatola<T> di esempi/scatola). */
public class Scatole {

    /** Stampa il contenuto di ogni scatola. */
    public static void stampa(Scatola<?> s) {
        System.out.println("contiene "
                + s.getContenuto());
    }

    public static void main(String[] args) {
        Scatola<String> s = new Scatola<>("ciao");
        Scatola<Integer> n = new Scatola<>(5);
        stampa(s);
        stampa(n);
        // Scatola<Object> o = s;      // errore
        Scatola<?> q = s;              // lecito
        Object c = q.getContenuto();   // lettura ok
        // q.setContenuto("x");        // errore
        System.out.println(c);
    }
}
