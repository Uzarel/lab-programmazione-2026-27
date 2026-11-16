/** Modulo: ricerca di un intero in un array (ordinato, per la binaria). */
public class RicercaBinaria {

    /** L'indice di x in v. */
    public static int ricercaLineare(int[] v, int x)
            throws NonTrovatoException {
        for (int i = 0; i < v.length; i++) {
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

    /** Cerca x in v[sinistra..destra]. */
    public static int ricercaRicorsiva(int[] v, int x,
            int sinistra, int destra)
            throws NonTrovatoException {
        if (sinistra > destra) {
            throw new NonTrovatoException(x);   // caso base
        }
        int medio = (sinistra + destra) / 2;
        if (v[medio] == x) {
            return medio;                       // caso base
        } else if (x < v[medio]) {
            return ricercaRicorsiva(v, x,
                    sinistra, medio - 1);
        } else {
            return ricercaRicorsiva(v, x,
                    medio + 1, destra);
        }
    }

    /** Cerca x in tutto v: parte da 0 e v.length - 1. */
    public static int ricercaRicorsiva(int[] v, int x)
            throws NonTrovatoException {
        return ricercaRicorsiva(v, x, 0, v.length - 1);
    }

    public static void main(String[] args) {
        int[] v = { 1, 3, 5, 10, 15, 23,
                    31, 47, 47, 56, 64 };
        try {
            System.out.println(ricercaLineare(v, 10));
            System.out.println(ricercaBinaria(v, 10));
            System.out.println(ricercaRicorsiva(v, 10));
            System.out.println(ricercaBinaria(v, 8));
        } catch (NonTrovatoException e) {
            System.out.println(e.getMessage());
        }
    }
}
