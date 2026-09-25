import java.util.Scanner;

public class SommaNumeri {

    public static void main(String[] args) {
        int risultato = sommaDueNumeri();
        System.out.printf("La somma è: %d%n", risultato);
    }

    public static int sommaDueNumeri() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Primo numero: ");
        int numero1 = scanner.nextInt();
        System.out.printf("Secondo numero: ");
        int numero2 = scanner.nextInt();
        scanner.close();
        return numero1 + numero2;
    }
}
