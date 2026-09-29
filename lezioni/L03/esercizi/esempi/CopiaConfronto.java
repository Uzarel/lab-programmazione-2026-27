/* Lezione 3 -- Copia e confronto di array: = e == lavorano sui riferimenti. */
public class CopiaConfronto {

    public static void stampa(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 1, 13, 0};

        int[] alias = a;                  // NON copia: stesso array, due nomi
        alias[0] = 99;
        System.out.print("a dopo alias[0] = 99:  ");
        stampa(a);                        // 99 5 1 13 0

        int[] b = new int[a.length];      // copia vera: nuovo array...
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];                  // ...e copia elemento per elemento
        }
        b[0] = 4;
        System.out.print("a dopo b[0] = 4:       ");
        stampa(a);                        // 99 5 1 13 0: a non e` cambiato

        int[] c = {99, 5, 1, 13, 0};
        System.out.println("a == alias ? " + (a == alias));   // true: stesso oggetto
        System.out.println("a == c     ? " + (a == c));       // false: oggetti diversi

        boolean uguali = a.length == c.length;
        for (int i = 0; i < a.length && uguali; i++) {
            if (a[i] != c[i]) {
                uguali = false;
            }
        }
        System.out.println("stessi elementi ? " + uguali);     // true
    }
}
