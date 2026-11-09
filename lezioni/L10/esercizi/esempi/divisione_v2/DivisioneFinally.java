import java.util.InputMismatchException;
import java.util.Scanner;

/** Divisione intera: multi-catch e finally. */
public class DivisioneFinally {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Due interi: ");
        try {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException
                | ArithmeticException e) {
            System.out.println("errore: " + e);
        } finally {
            System.out.println("tentativo concluso");
        }
        System.out.println("fine");
    }
}
