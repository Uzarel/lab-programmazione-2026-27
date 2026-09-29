/* Lezione 3 -- Anatomia di un metodo: intestazione, corpo, return. */
import java.util.Scanner;

public class Somma {

    // modificatori  tipo    nome  (parametri formali)
    public static double somma(double a, double b) {
        double c;          // variabile locale
        c = a + b;
        return c;          // il valore restituito ha il tipo dell'intestazione
    }

    // Un metodo "procedura": tipo void, nessun return con valore
    public static void stampaRisultato(String etichetta, double valore) {
        System.out.printf("%s = %.2f%n", etichetta, valore);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Due numeri reali: ");
        double op1 = in.nextDouble();
        double op2 = in.nextDouble();
        in.close();

        double ris = somma(op1, op2);          // chiamata: e` un'espressione di tipo double
        stampaRisultato("somma", ris);         // chiamata: e` un'istruzione
        stampaRisultato("doppia somma", somma(ris, ris));
    }
}
