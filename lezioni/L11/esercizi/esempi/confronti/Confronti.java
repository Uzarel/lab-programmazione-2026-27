/** Quanti confronti fanno le due ricerche nel caso peggiore. */
public class Confronti {

    private static int confronti = 0;

    /** L'indice di x in v. */
    public static int ricercaLineare(int[] v, int x)
            throws NonTrovatoException {
        for (int i = 0; i < v.length; i++) {
            confronti++;
            if (v[i] == x) {
                return i;
            }
        }
        throw new NonTrovatoException(x);
    }

    /** L'indice di x in v, ordinato. */
    public static int ricercaBinaria(int[] v, int x)
            throws NonTrovatoException {
        int sinistra = 0;
        int destra = v.length - 1;
        while (sinistra <= destra) {
            int medio = (sinistra + destra) / 2;
            confronti++;
            if (v[medio] == x) {
                return medio;
            } else if (x < v[medio]) {
                destra = medio - 1;
            } else {
                sinistra = medio + 1;
            }
        }
        throw new NonTrovatoException(x);
    }

    public static void main(String[] args)
            throws NonTrovatoException {
        int[] taglie = { 10, 1000, 1000000 };
        for (int n : taglie) {
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = i;
            }
            confronti = 0;
            ricercaLineare(v, n - 1);  // ultimo
            int lineare = confronti;
            confronti = 0;
            ricercaBinaria(v, n - 1);
            System.out.println(n + ": "
                + lineare + " " + confronti);
        }
    }
}
