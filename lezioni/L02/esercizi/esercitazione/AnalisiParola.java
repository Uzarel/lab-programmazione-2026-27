/* Lezione 2 -- "Commentiamo insieme": analisi di una parola letta da tastiera. */
import java.util.Scanner;

public class AnalisiParola {

    public static int contaVocali(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".indexOf(s.charAt(i)) >= 0) {
                n++;
            }
        }
        return n;
    }

    public static String rovescia(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static boolean isPalindroma(String s) {
        return s.equals(rovescia(s));        // equals, non ==
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Scrivi una parola: ");
        String parola = in.next().toLowerCase();   // una parola, tutta minuscola
        in.close();

        int lunghezza = parola.length();
        char prima = parola.charAt(0);
        char ultima = parola.charAt(lunghezza - 1);

        System.out.printf("Parola:      %s%n", parola);
        System.out.printf("Lunghezza:   %d%n", lunghezza);
        System.out.printf("Maiuscolo:   %s%n", parola.toUpperCase());
        System.out.printf("Iniziale:    %c   Finale: %c%n", prima, ultima);
        System.out.printf("Vocali:      %d   Consonanti: %d%n",
                          contaVocali(parola), lunghezza - contaVocali(parola));
        System.out.printf("Rovesciata:  %s%n", rovescia(parola));
        System.out.printf("Palindroma?  %b%n", isPalindroma(parola));
        System.out.printf("Stessi estremi? %b%n", prima == ultima);
    }
}
