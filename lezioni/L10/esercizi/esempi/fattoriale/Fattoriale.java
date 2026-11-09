/** Il fattoriale, ricorsivo. */
public class Fattoriale {

    /** n!, con 0 <= n <= 12. */
    public static int fattoriale(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "n negativo: " + n);
        }
        if (n == 0) {
            return 1;       // caso base
        }
        // caso ricorsivo
        return n * fattoriale(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fattoriale(3));
        System.out.println(fattoriale(12));
    }
}
