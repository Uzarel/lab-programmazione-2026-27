/* Lezione 2 -- "Insieme, passo passo": il cifrario di Cesare.
   Ogni lettera viene sostituita con quella che si trova `chiave` posizioni piu` avanti
   nell'alfabeto (tornando all'inizio dopo la z). Gli altri caratteri restano uguali.
   Niente aritmetica sui caratteri: usiamo l'ALFABETO come stringa e indexOf/charAt. */
import java.util.Scanner;

public class Cesare {

    public static final String ALFABETO = "abcdefghijklmnopqrstuvwxyz";

    /** Sposta la singola lettera minuscola c di `chiave` posizioni. */
    public static char sposta(char c, int chiave) {
        int posizione = ALFABETO.indexOf(c);
        if (posizione < 0) {                       // non e` una lettera minuscola
            return c;
        }
        int nuova = (posizione + chiave) % 26;     // "torna a capo" dopo la z
        return ALFABETO.charAt(nuova);
    }

    /** Cifra tutto il testo, lettera per lettera. */
    public static String cifra(String testo, int chiave) {
        StringBuilder risultato = new StringBuilder();
        for (int i = 0; i < testo.length(); i++) {
            risultato.append(sposta(testo.charAt(i), chiave));
        }
        return risultato.toString();
    }

    /** Decifrare = cifrare con la chiave "complementare". */
    public static String decifra(String testo, int chiave) {
        return cifra(testo, 26 - chiave % 26);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Testo da cifrare: ");
        String testo = in.nextLine().toLowerCase();
        System.out.print("Chiave (0-25):    ");
        int chiave = in.nextInt();
        in.close();

        String cifrato = cifra(testo, chiave);
        String decifrato = decifra(cifrato, chiave);
        boolean uguale = decifrato.equals(testo);
        System.out.println("Cifrato:   " + cifrato);
        System.out.println("Decifrato: " + decifrato);
        System.out.println("Uguale? " + uguale);
    }
}
