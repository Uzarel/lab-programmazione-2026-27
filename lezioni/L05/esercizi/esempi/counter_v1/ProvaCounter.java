/** Programma di prova per Counter, versione 1. */
public class ProvaCounter {
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter d = new Counter();

        c.increment();
        c.increment();
        c.increment();
        c.decrement();
        d.increment();

        // ERRORE: value e` private
        // c.value = 100;
        // System.out.println(d.value);
    }
}
