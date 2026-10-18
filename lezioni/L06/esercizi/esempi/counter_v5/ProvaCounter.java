/** Prova di Counter, versione 5: this, membri static, variabili final. */
public class ProvaCounter {

    // b.getObjCount() e` voluto: compila, ma e` fuorviante (vedi slide)
    @SuppressWarnings("static")
    public static void main(String[] args) {
        System.out.println(Counter.getObjCount());   // 0
        System.out.println(Counter.DEFAULT_MAX);     // 10

        Counter b = new Counter();
        Counter c = new Counter(4);
        Counter d = new Counter(c);
        System.out.println(Counter.getObjCount());   // 3
        System.out.println(b.getObjCount());         // 3

        c.increment();
        d.increment();
        d.increment();
        System.out.println(c.getValue());   // 1
        System.out.println(d.getValue());   // 2

        System.out.println(b.getMax());              // 10
        System.out.println(c.getMax());              // 4
        // c.setMax(2);   // ERRORE: setMax non esiste

        // ERRORE: objCount e` private
        // Counter.objCount = 100;
        // ERRORE: DEFAULT_MAX e` final
        // Counter.DEFAULT_MAX = 20;
    }
}
