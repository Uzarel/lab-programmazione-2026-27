/** Ricorsione in coda e la sua versione iterativa. */
public class ContoAllaRovescia {

    public static void contoAllaRovescia(int n) {
        if (n == 0) {
            System.out.println("via!");
        } else {
            System.out.println(n);
            contoAllaRovescia(n - 1);
        }
    }

    public static void contoIterativo(int n) {
        while (n != 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("via!");
    }

    public static void main(String[] args) {
        contoAllaRovescia(3);
        contoIterativo(3);
    }
}
