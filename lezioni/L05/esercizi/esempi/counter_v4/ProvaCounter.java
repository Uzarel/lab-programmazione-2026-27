/** Programma di prova per Counter, versione 4. */
public class ProvaCounter {
    public static void main(String[] args) {
        Counter c = new Counter(2);
        while (!c.ovf()) {
            c.increment();
        }
        System.out.println(c.getValue());   // 2

        if (!c.ovf()) {
            c.increment();
        } else {
            System.out.println("c al massimo");
        }

        c.decrement();
        c.decrement();
        if (!c.unf()) {
            c.decrement();
        } else {
            System.out.println("c a zero");
        }
        System.out.println(c.getValue());   // 0
    }
}
