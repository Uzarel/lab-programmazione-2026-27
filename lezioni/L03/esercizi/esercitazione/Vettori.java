/* Lezione 3 -- "Commentiamo insieme": una piccola libreria di funzioni su array. */
public class Vettori {

    public static void stampa(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(v[i]);
        }
        System.out.println("]");
    }

    public static int somma(int[] v) {
        int s = 0;
        for (int x : v) {
            s += x;
        }
        return s;
    }

    /** Media di un array di int. Precondizione: v.length > 0. */
    public static double media(int[] v) {
        double s = somma(v);               // double, altrimenti divisione intera
        return s / v.length;
    }

    /** Media di un array di double: stesso nome, firma diversa (overloading). */
    public static double media(double[] v) {
        double s = 0;
        for (double x : v) {
            s += x;
        }
        return s / v.length;
    }

    public static int massimo(int[] v) {
        int max = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        return max;
    }

    /** Ricerca lineare: indice della prima occorrenza di x, oppure -1. */
    public static int indiceDi(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /** Inverte l'array SUL POSTO: modifica quello del chiamante. */
    public static void inverti(int[] v) {
        for (int i = 0; i < v.length / 2; i++) {
            int tmp = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = tmp;
        }
    }

    /** Restituisce un array NUOVO con gli elementi in ordine inverso. */
    public static int[] invertito(int[] v) {
        int[] r = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            r[i] = v[v.length - 1 - i];
        }
        return r;
    }

    public static void main(String[] args) {
        int[] v = {12, 7, 3, 21, 7, 9};
        System.out.print("v            = "); stampa(v);
        System.out.println("somma        = " + somma(v));
        System.out.println("media        = " + media(v));
        System.out.println("massimo      = " + massimo(v));
        System.out.println("indiceDi(7)  = " + indiceDi(v, 7));
        System.out.println("indiceDi(8)  = " + indiceDi(v, 8));

        int[] w = invertito(v);
        System.out.print("invertito(v) = "); stampa(w);
        System.out.print("v            = "); stampa(v);    // intatto

        inverti(v);
        System.out.print("dopo inverti = "); stampa(v);    // modificato

        double[] d = {1.5, 2.5, 3.0};
        System.out.println("media(double[]) = " + media(d));
    }
}
