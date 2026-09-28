/* Lezione 2 -- I tipi primitivi: dichiarazioni, letterali, operazioni. */
public class TipiPrimitivi {

    public static void main(String[] args) {
        // Interi: byte (8 bit), short (16), int (32), long (64)
        int abitanti = 913_000;            // il trattino basso rende leggibile il letterale
        long distanzaKm = 149_600_000L;    // suffisso L: letterale di tipo long
        byte piccolo = 127;                // il massimo per un byte

        // Reali: float (32 bit, suffisso f), double (64 bit, il default)
        double pi = 3.14159;
        float tasso = 0.035f;

        // Carattere (16 bit, Unicode) e booleano
        char iniziale = 'M';               // apici SINGOLI per i char
        boolean iscritto = true;

        System.out.printf("abitanti = %d, distanza = %d km%n", abitanti, distanzaKm);
        System.out.printf("pi = %.3f, tasso = %.3f, iniziale = %c, iscritto = %b%n",
                          pi, tasso, iniziale, iscritto);
        System.out.println("byte massimo = " + piccolo);

        // Gli interi hanno un intervallo finito: oltre il massimo si "riparte" dal minimo
        int massimo = Integer.MAX_VALUE;   // costante di libreria: 2147483647
        System.out.println("massimo int  = " + massimo);
        System.out.println("massimo + 1  = " + (massimo + 1));   // overflow!

        // Divisione: intera fra int, reale se almeno un operando e` double
        int a = 7, b = 2;
        System.out.println("7 / 2   = " + (a / b));     // 3
        System.out.println("7 % 2   = " + (a % b));     // 1 (resto)
        System.out.println("7.0 / 2 = " + (7.0 / b));   // 3.5

        // Una variabile locale va inizializzata prima dell'uso:
        // int x;  System.out.println(x);   // ERRORE di compilazione
    }
}
