import java.util.Scanner;

public class Media {

    // il calcolo, separato dall'input/output
    public static double media(double somma, int n) {
        return somma / n;   // somma e` double: la divisione e` reale
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quanti voti? ");
        int n = in.nextInt();
        double somma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Voto " + i + ": ");
            somma += in.nextInt();
        }
        System.out.printf("Media: %.2f%n", media(somma, n));
        in.close();
    }
}
