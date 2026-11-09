/** Il caso base non viene mai raggiunto. */
public class SenzaBase {

    /** Nessun controllo su n < 0. */
    public static int fattoriale(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fattoriale(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fattoriale(-1));
    }
}
