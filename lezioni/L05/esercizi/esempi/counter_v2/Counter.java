/** Counter, versione 2: i costruttori. */
public class Counter {

    private int value;   // valore corrente
    private int max;     // valore massimo

    // costruttore senza argomenti
    public Counter() {
        max = 10;
        value = 0;
    }

    // costruttore con argomenti
    public Counter(int m) {
        max = m;
        value = 0;
    }

    // costruttore di copia
    public Counter(Counter c) {
        max = c.max;
        value = c.value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }
}
