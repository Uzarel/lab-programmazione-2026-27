/** Confronto di riferimenti e confronto di oggetti. */
public class Confronto {

    public static void main(String[] args) {
        Counter c = new Counter(4);
        Counter d = new Counter(c);   // copia di c
        Counter e = c;                // alias di c

        System.out.println(c == d);          // false
        System.out.println(c.equals(d));     // true
        System.out.println(c == e);          // true

        d.increment();
        System.out.println(c.equals(d));     // false
        System.out.println(c.notEqual(d));   // true
    }
}
