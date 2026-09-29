/* Lezione 3 -- Variabili locali e visibilita` dei blocchi. */
public class Visibilita {

    public static int raddoppia(int x) {   // x e` locale al metodo
        int y = x * 2;                     // y e` locale al metodo
        // int x = 0;                      // ERRORE: x e` gia` un parametro
        return y;
    }

    public static void main(String[] args) {
        int totale = 0;                    // visibile in tutto il main
        for (int i = 1; i <= 3; i++) {     // i esiste solo dentro il for
            int parziale = raddoppia(i);   // parziale esiste solo dentro il for
            totale += parziale;
        }
        // System.out.println(i);          // ERRORE: i non esiste piu` qui
        // System.out.println(y);          // ERRORE: y appartiene a raddoppia
        System.out.println("totale = " + totale);   // 12
    }
}
