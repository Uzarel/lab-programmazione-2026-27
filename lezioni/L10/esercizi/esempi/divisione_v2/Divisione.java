import java.util.InputMismatchException;
import java.util.Scanner;

/** Divisione intera: gli errori sono gestiti con try e catch. */
public class Divisione {

    public static int quoziente(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Due interi: ");
        try {
            int a = in.nextInt();
            int b = in.nextInt();
            int q = quoziente(a, b);
            System.out.println("quoziente: " + q);
        } catch (InputMismatchException e) {
            System.out.println("servono due interi");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("fine");
    }
}
