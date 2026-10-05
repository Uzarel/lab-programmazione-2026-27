import java.util.Scanner;

public class Frequenze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Testo: ");
        String testo = in.nextLine();
        in.close();

        int[] conteggi = Lettere.conta(testo);
        int totale = Statistiche.somma(conteggi);
        int max = Statistiche.massimo(conteggi);

        for (int i = 0; i < Lettere.QUANTE; i++) {
            int n = conteggi[i];
            if (n > 0) {
                double perc = (double) n / totale * 100;
                System.out.printf("%c %3d %5.1f%%",
                        Lettere.lettera(i), n, perc);
                if (n == max) {
                    System.out.print("  <-- max");
                }
                System.out.println();
            }
        }
    }
}
