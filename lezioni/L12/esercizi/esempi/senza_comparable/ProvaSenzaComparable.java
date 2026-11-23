import java.util.Arrays;

/** Termina apposta con ClassCastException: Persona non e' Comparable. */
public class ProvaSenzaComparable {

    public static void main(String[] args) {
        Persona[] elenco = { new Persona("Anna", "Russo", 35),
                             new Persona("Luca", "Verde", 20) };
        Arrays.sort(elenco);   // compila, ma...
        System.out.println(Arrays.toString(elenco));
    }
}
