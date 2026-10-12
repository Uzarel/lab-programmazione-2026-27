/** Programma di prova per Counter, versione 3. */
public class ProvaCounter {
    public static void main(String[] args) {
        Counter b = new Counter();
        Counter c = new Counter(4);
        c.increment();
        Counter d = new Counter(c);
        c.increment();

        System.out.println(b.getMax());     // 10
        System.out.println(c.getValue());   // 2
        System.out.println(d.getValue());   // 1

        d.setMax(20);
        System.out.println(d.getMax());     // 20
        System.out.println(c.getMax());     // 4

        // c.value = 3;     // ERRORE: private
        // c.setValue(3);   // ERRORE: non esiste
    }
}
