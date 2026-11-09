/** secondo cattura e rilancia, primo gestisce. */
public class CatenaRilancio {

    public static void main(String[] args) {
        primo();
        System.out.println("fine");
    }

    public static void primo() {
        try {
            secondo();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    public static void secondo() {
        try {
            terzo();
        } catch (IllegalArgumentException e) {
            System.out.println("secondo: rilancio");
            throw e;
        }
    }

    public static void terzo() {
        throw new IllegalArgumentException("errore");
    }
}
