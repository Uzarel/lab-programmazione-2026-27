import java.util.Scanner;

/** Punto di partenza: tutto nel main, con gli strumenti delle lezioni 1-3. */
public class FrequenzeMonolite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Testo: ");
        String testo = in.nextLine().toLowerCase();
        in.close();
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        int[] conteggi = new int[26];
        int totale = 0;
        for (int i = 0; i < testo.length(); i++) {
            int p = alfabeto.indexOf(testo.charAt(i));
            if (p >= 0) {
                conteggi[p]++;
                totale++;
            }
        }
        int max = conteggi[0];
        for (int i = 1; i < 26; i++) {
            if (conteggi[i] > max) {
                max = conteggi[i];
            }
        }
        for (int i = 0; i < 26; i++) {
            int n = conteggi[i];
            if (n > 0) {
                double perc = 100.0 * n / totale;
                System.out.printf("%c %3d %5.1f%%",
                    alfabeto.charAt(i), n, perc);
                if (n == max) {
                    System.out.print("  <-- max");
                }
                System.out.println();
            }
        }
    }
}
