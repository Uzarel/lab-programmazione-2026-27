/** Counter, versione 1: lo stato e due operazioni. */
public class Counter {

    private int value;   // valore corrente
    private int max;     // valore massimo

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }
}
