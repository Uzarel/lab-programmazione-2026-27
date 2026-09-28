/* Lezione 2 -- Concatenazione con + e conversione automatica in stringa. */
public class Concatenazione {

    public static void main(String[] args) {
        String nome = "Anna";
        int esami = 7;
        double media = 27.333;
        boolean inCorso = true;

        // Se uno dei due operandi di + e` una String, l'altro viene convertito in stringa
        String riga = nome + " ha " + esami + " esami, media " + media + ", in corso: " + inCorso;
        System.out.println(riga);

        // L'ordine conta: + e` valutato da sinistra a destra
        System.out.println("" + 1 + 2);      // "12"   (stringa, poi 1, poi 2)
        System.out.println(1 + 2 + "");      // "3"    (prima la somma fra int)
        System.out.println("Somma: " + (1 + 2)); // "Somma: 3" (le parentesi forzano la somma)

        // += concatena e riassegna
        String s = "a";
        s += "b";
        s += 3;
        System.out.println(s);               // ab3

        // Da valore a stringa e viceversa
        String daNumero = String.valueOf(42);          // "42"
        int daStringa = Integer.parseInt("42");        // 42
        System.out.println(daNumero + 1);              // "421"
        System.out.println(daStringa + 1);             // 43
    }
}
