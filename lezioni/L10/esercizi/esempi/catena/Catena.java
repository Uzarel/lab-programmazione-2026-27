/** Un'eccezione risale la catena delle chiamate. */
public class Catena {

    public static void main(String[] args) {
        primo();
    }

    public static void primo() {
        secondo();
    }

    public static void secondo() {
        terzo();
    }

    public static void terzo() {
        throw new IllegalArgumentException("errore");
    }
}
