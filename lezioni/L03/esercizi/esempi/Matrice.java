/* Lezione 3 -- Array bidimensionali: matrici e array "frastagliati". */
public class Matrice {

    public static void stampa(int[][] m) {
        for (int r = 0; r < m.length; r++) {           // m.length: numero di righe
            for (int c = 0; c < m[r].length; c++) {    // m[r].length: colonne della riga r
                System.out.printf("%4d", m[r][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] m1 = new int[2][3];                    // 2 righe x 3 colonne, tutti 0
        int[][] m2 = {{4, 5, 9}, {1, 13, 0}};          // 2 x 3, inizializzata
        int[][] m3 = {{4, 5}, {8}, {1, 13, 0}};        // righe di lunghezza diversa

        m1[1][2] = 7;
        System.out.println("m1:"); stampa(m1);
        System.out.println("m2:"); stampa(m2);
        System.out.println("m3:"); stampa(m3);

        int[][] m4 = new int[2][];                     // 2 righe, colonne da decidere
        m4[0] = new int[5];
        m4[1] = new int[3];
        System.out.println("m4[0].length = " + m4[0].length + ", m4[1].length = " + m4[1].length);

        for (int[] riga : m2) {                        // for potenziato: ogni riga e` un int[]
            for (int x : riga) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
}
