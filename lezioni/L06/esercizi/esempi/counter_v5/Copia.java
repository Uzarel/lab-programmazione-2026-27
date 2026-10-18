/** Copia di riferimenti e copia di oggetti. */
public class Copia {

    public static void main(String[] args) {
        Counter b = new Counter(4);
        Counter c = new Counter(7);

        c = b;            // copia il riferimento
        c.increment();
        System.out.println(b.getValue());   // 1
        System.out.println(c.getMax());     // 4

        Counter d = new Counter(b);   // copia l'oggetto
        d.increment();
        System.out.println(b.getValue());   // 1
        System.out.println(d.getValue());   // 2
    }
}
