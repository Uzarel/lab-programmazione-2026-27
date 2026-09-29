/* Lezione 3 -- Dimensione massima e riempimento. */
import java.util.Scanner;

public class Riempimento {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX = 200;
        int[] a = new int[MAX];           // dimensione MASSIMA
        int n;                            // riempimento: quanti elementi uso davvero

        System.out.print("Quanti elementi (max " + MAX + ")? ");
        n = in.nextInt();
        System.out.println("Inserisci " + n + " interi:");
        for (int i = 0; i < n; i++) {     // uso solo n elementi su MAX
            a[i] = in.nextInt();
        }
        in.close();

        int somma = 0;
        for (int i = 0; i < n; i++) {     // NON a.length: sarebbe 200
            somma += a[i];
        }
        System.out.println("somma dei " + n + " elementi = " + somma);

        // Alternativa: dimensione decisa a tempo di esecuzione
        int[] esatto = new int[n];        // new accetta anche una variabile
        System.out.println("esatto.length = " + esatto.length);
    }
}
