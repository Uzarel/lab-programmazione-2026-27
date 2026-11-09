import java.util.Scanner;

/** Divisione intera di due numeri da tastiera. */
public class Divisione {

    public static int quoziente(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Due interi: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int q = quoziente(a, b);
        System.out.println("quoziente: " + q);
        System.out.println("fine");
    }
}
