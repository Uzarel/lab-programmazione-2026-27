/* Lezione 2 -- StringBuilder: una sequenza di caratteri MODIFICABILE. */
public class UsaStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Diego");
        System.out.println("length   = " + sb.length());     // 5
        System.out.println("capacity = " + sb.capacity());   // 21 = 5 + 16

        sb.append(" 10");                 // aggiunge in coda: "Diego 10"
        sb.insert(0, "Don ");             // inserisce in testa: "Don Diego 10"
        sb.setCharAt(0, 'd');             // modifica un carattere: "don Diego 10"
        sb.deleteCharAt(11);              // toglie l'ultimo (indice 11): "don Diego 1"
        System.out.println(sb);           // toString() implicito

        sb.reverse();                     // rovescia IN PLACE
        System.out.println(sb);           // 1 ogeiD nod

        String risultato = sb.reverse().toString();   // le chiamate si possono concatenare
        System.out.println(risultato);

        // Costruire una stringa carattere per carattere
        StringBuilder alfabeto = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            alfabeto.append(c);
        }
        System.out.println(alfabeto);     // abcdefghijklmnopqrstuvwxyz
    }
}
