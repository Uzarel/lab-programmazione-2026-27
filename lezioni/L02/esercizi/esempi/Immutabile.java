/* Lezione 2 -- Le stringhe sono immutabili: i metodi restituiscono una NUOVA stringa. */
public class Immutabile {

    public static void main(String[] args) {
        String nome = "diego";

        nome.toUpperCase();                  // il risultato viene calcolato... e perso
        System.out.println(nome);            // diego

        String maiuscolo = nome.toUpperCase();   // il risultato va salvato in una variabile
        System.out.println(maiuscolo);       // DIEGO
        System.out.println(nome);            // diego: l'originale non e` cambiato

        nome = nome.toUpperCase();           // oppure si riassegna la stessa variabile
        System.out.println(nome);            // DIEGO

        // Stesso discorso per concat, replace, trim, substring, ...
        String saluto = "ciao";
        saluto.concat(" a tutti");
        System.out.println(saluto);          // ciao
        saluto = saluto.concat(" a tutti");
        System.out.println(saluto);          // ciao a tutti
    }
}
