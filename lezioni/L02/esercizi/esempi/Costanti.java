/* Lezione 2 -- Costanti con final e costanti di libreria (Math). */
import static java.lang.Math.PI;   // importa la sola costante PI

public class Costanti {

    public static double areaCerchio(double raggio) {
        return PI * raggio * raggio;           // PI invece di Math.PI
    }

    public static void main(String[] args) {
        final double IVA = 0.22;               // costante: non puo` cambiare
        final int MAX_TENTATIVI;               // lecito: inizializzata dopo...
        MAX_TENTATIVI = 3;                     // ...ma UNA sola volta
        // IVA = 0.10;                         // ERRORE di compilazione

        double prezzo = 100.0;
        System.out.printf("Prezzo con IVA: %.2f%n", prezzo * (1 + IVA));
        System.out.println("Tentativi massimi: " + MAX_TENTATIVI);

        System.out.printf("Area cerchio r=2: %.4f%n", areaCerchio(2.0));
        System.out.println("Math.PI  = " + Math.PI);
        System.out.println("sqrt(2)  = " + Math.sqrt(2));
        System.out.println("2^10     = " + Math.pow(2, 10));
        System.out.println("max(3,8) = " + Math.max(3, 8));
        System.out.println("abs(-5)  = " + Math.abs(-5));
        System.out.println("round(2.5) = " + Math.round(2.5));
    }
}
