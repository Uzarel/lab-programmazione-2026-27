/** Modulo: i voti d'esame in trentesimi. */
public class Voti {

    public static final int MINIMO = 18;
    public static final int MASSIMO = 30;

    /** true se v e` un voto valido. */
    public static boolean isValido(int v) {
        return v >= MINIMO && v <= MASSIMO;
    }

    /** La media riportata in 110-esimi. */
    public static int baseLaurea(double media) {
        return arrotonda(media * 110 / MASSIMO);
    }

    // corpo: visibile solo dentro Voti
    private static int arrotonda(double x) {
        return (int) (x + 0.5);
    }
}
