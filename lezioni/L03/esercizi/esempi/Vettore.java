/* Lezione 3 -- Array monodimensionali: creazione, valori di default, length, for potenziato. */
public class Vettore {

    public static void main(String[] args) {
        int[] a = new int[5];             // 5 int, tutti 0
        double[] d = new double[3];       // 3 double, tutti 0.0
        boolean[] b = new boolean[2];     // 2 boolean, tutti false
        String[] s = new String[2];       // 2 riferimenti, tutti null

        System.out.println(a[0] + " " + d[0] + " " + b[0] + " " + s[0]);

        int[] voti = {28, 30, 24, 27, 30};   // inizializzazione: new implicito
        System.out.println("length = " + voti.length);   // 5

        for (int i = 0; i < voti.length; i++) {          // for classico: ho l'indice
            System.out.printf("voti[%d] = %d%n", i, voti[i]);
        }

        double somma = 0;                                // double: la media sara` reale
        for (int v : voti) {                             // for potenziato: solo lettura
            somma += v;
        }
        System.out.println("media = " + somma / voti.length);

        voti[4] = 18;                     // modifica di un elemento
        // voti[5] = 30;                  // ArrayIndexOutOfBoundsException: indici 0..4
        System.out.println("ultimo = " + voti[voti.length - 1]);
    }
}
