/** Modulo: le 26 lettere come indici. */
public class Lettere {

    public static final int QUANTE = 26;

    /** L'indice 0 e` 'a', il 25 e` 'z'. */
    public static char lettera(int indice) {
        return (char) ('a' + indice);
    }

    /** CREA l'array dei 26 conteggi. */
    public static int[] conta(String s) {
        int[] conteggi = new int[QUANTE];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            c = Character.toLowerCase(c);
            if (isLettera(c)) {
                conteggi[indice(c)]++;
            }
        }
        return conteggi;
    }

    // corpo: solo le minuscole da 'a' a 'z'
    private static boolean isLettera(char c) {
        return c >= 'a' && c <= 'z';
    }

    // 'a' -> 0, 'b' -> 1, ..., 'z' -> 25
    private static int indice(char c) {
        return c - 'a';
    }
}
