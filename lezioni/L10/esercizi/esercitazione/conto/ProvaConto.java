import java.util.InputMismatchException;
import java.util.Scanner;

/** Prova di ContoBancario: input robusto ed eccezioni. */
public class ProvaConto {

    /** Legge un importo positivo: insiste. */
    public static double leggiImporto(Scanner in) {
        double importo = 0;
        while (importo <= 0) {
            System.out.print("Importo: ");
            try {
                importo = in.nextDouble();
            } catch (InputMismatchException e) {
                in.nextLine();   // scarta l'input
                System.out.println("non e' un numero");
            }
        }
        return importo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ContoBancario anna = new ContoBancario("Anna");
        ContoBancario luca = new ContoBancario("Luca");
        anna.versa(100);
        try {
            anna.preleva(leggiImporto(in));
            System.out.println("prelievo eseguito");
        } catch (SaldoInsufficienteException e) {
            System.out.println("mancano " + e.getMancante());
        } finally {
            System.out.println(anna);
        }
        try {
            anna.trasferisci(luca, 70);
        } catch (SaldoInsufficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(anna + ", " + luca);
    }
}
