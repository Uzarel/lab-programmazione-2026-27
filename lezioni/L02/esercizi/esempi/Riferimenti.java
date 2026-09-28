/* Lezione 2 -- Riferimenti: cosa contiene davvero una variabile String. */
public class Riferimenti {

    public static void main(String[] args) {
        String str1 = new String("JAVA");   // 1. nuovo oggetto
        String str2 = new String("JAVA");   // 2. un ALTRO oggetto con lo stesso contenuto
        String str3 = str1;                 // 3. copia del RIFERIMENTO: stesso oggetto di str1

        System.out.println("str1.equals(str2) ? " + str1.equals(str2));  // true
        System.out.println("str1 == str2      ? " + (str1 == str2));     // false
        System.out.println("str1 == str3      ? " + (str1 == str3));     // true

        // Un riferimento puo` non riferire alcun oggetto: null
        String nessuno = null;
        System.out.println("nessuno = " + nessuno);          // stampa "null"
        System.out.println("nessuno == null ? " + (nessuno == null));

        // Usare un riferimento null per chiamare un metodo ferma il programma:
        // System.out.println(nessuno.length());   // NullPointerException a run-time
    }
}
