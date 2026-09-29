/* Lezione 3 -- Array come parametro e come valore di ritorno. */
public class ArrayParametro {

    /** Modifica l'array del chiamante: riceve una copia del RIFERIMENTO. */
    public static void azzeraPrimo(int[] v) {
        v[0] = 0;
    }

    /** Non ha effetto sul chiamante: riassegna solo la copia del riferimento. */
    public static void sostituisci(int[] v) {
        v = new int[] {7, 7, 7};
        System.out.println("  dentro: v[0] = " + v[0]);
    }

    /** Restituisce un array NUOVO, senza toccare quello ricevuto. */
    public static int[] raddoppiato(int[] v) {
        int[] r = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            r[i] = 2 * v[i];
        }
        return r;
    }

    public static void main(String[] args) {
        int[] a = {30, 20, 10};
        azzeraPrimo(a);
        System.out.println("dopo azzeraPrimo: a[0] = " + a[0]);      // 0

        sostituisci(a);
        System.out.println("dopo sostituisci: a[0] = " + a[0]);      // ancora 0

        int[] d = raddoppiato(a);
        System.out.println("d[1] = " + d[1] + ", a[1] = " + a[1]);   // 40, 20
    }
}
