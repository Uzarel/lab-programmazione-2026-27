/* Lezione 2 -- Scorrere una stringa carattere per carattere con charAt. */
public class ScorriStringa {

    /** Quante vocali (minuscole o maiuscole) contiene s? */
    public static int contaVocali(String s) {
        int vocali = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiouAEIOU".indexOf(c) >= 0) {   // c e` una delle vocali?
                vocali++;
            }
        }
        return vocali;
    }

    /** Quante volte il carattere c compare in s? */
    public static int conta(String s, char c) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {              // fra char si puo` usare ==
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        String frase = "Programmare in Java";
        System.out.println("vocali in \"" + frase + "\": " + contaVocali(frase));
        System.out.println("'a' compare " + conta(frase, 'a') + " volte");
        System.out.println("' ' compare " + conta(frase, ' ') + " volte");
    }
}
