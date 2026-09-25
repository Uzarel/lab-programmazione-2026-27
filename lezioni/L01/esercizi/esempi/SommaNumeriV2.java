import java.util.Scanner;

/* Versione "migliorata" discussa in aula:
   l'input resta nel main, il calcolo e` isolato in un metodo. */
public class SommaNumeriV2 {

    // il calcolo, separato dall'input/output
    public static int somma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Primo numero: ");
        int numero1 = in.nextInt();
        System.out.print("Secondo numero: ");
        int numero2 = in.nextInt();
        System.out.printf("La somma è: %d%n", somma(numero1, numero2));
        in.close();
    }
}
