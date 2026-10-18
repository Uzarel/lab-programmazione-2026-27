public class Counter {

    public static final int DEFAULT_MAX = 10;
    private static int objCount;   // creati finora

    private int value;       // valore corrente
    private final int max;   // valore massimo

    // costruttore senza argomenti
    public Counter() {
        max = DEFAULT_MAX;
        value = 0;
        objCount++;
    }

    // costruttore con argomenti
    public Counter(int m) {
        max = m;
        value = 0;
        objCount++;
    }

    // costruttore di copia
    public Counter(Counter c) {
        max = c.max;
        value = c.value;
        objCount++;
    }

    // metodo static: non lavora su un oggetto
    public static int getObjCount() {
        return objCount;
    }

    // metodi get: leggono lo stato
    public int getValue() {
        return value;
    }

    public int getMax() {
        return max;
    }

    // setMax non c'e` piu`: non compilerebbe
    // public void setMax(int m) {
    //     max = m;   // ERRORE: max e` final
    // }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    // predicati: true se l'operazione
    // porterebbe value fuori da 0..max
    public boolean ovf() {
        return (value + 1) > max;
    }

    public boolean unf() {
        return (value - 1) < 0;
    }

    // confronto: true se i due oggetti
    // hanno lo stesso stato
    public boolean equals(Counter c) {
        return max == c.max && value == c.value;
    }

    public boolean notEqual(Counter c) {
        return !equals(c);
    }
}
