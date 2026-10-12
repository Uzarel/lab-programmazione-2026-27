/** Counter, versione 3: i metodi get e set. */
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

    // metodi get: leggono lo stato
    public int getValue() {
        return value;
    }

    public int getMax() {
        return max;
    }

    // metodo set: modifica lo stato
    public void setMax(int m) {
        max = m;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }
}
