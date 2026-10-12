/** Programma di prova per Counter, versione 2. */
public class ProvaCounter {
    public static void main(String[] args) {
        Counter b = new Counter();    // max 10
        Counter c = new Counter(4);   // max 4
        c.increment();

        Counter d = new Counter(c);   // copia di c
        c.increment();                // d non cambia

        // ERRORE: max e` private, non e` visibile
        // fuori dalla classe Counter
        // System.out.println(c.max);
    }
}
