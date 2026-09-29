/* Lezione 3 -- "Insieme, passo passo": matrici (lettura, stampa, trasposta, somma). */
import java.util.Scanner;

public class Matrici {

    /** Legge una matrice righe x colonne, un intero alla volta. */
    public static int[][] leggi(Scanner in, int righe, int colonne) {
        int[][] m = new int[righe][colonne];
        for (int r = 0; r < righe; r++) {
            for (int c = 0; c < colonne; c++) {
                m[r][c] = in.nextInt();
            }
        }
        return m;
    }

    public static void stampa(int[][] m) {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                System.out.printf("%4d", m[r][c]);
            }
            System.out.println();
        }
    }

    /** La trasposta: t[c][r] = m[r][c]. Da righe x colonne a colonne x righe. */
    public static int[][] trasposta(int[][] m) {
        int righe = m.length;
        int colonne = m[0].length;
        int[][] t = new int[colonne][righe];
        for (int r = 0; r < righe; r++) {
            for (int c = 0; c < colonne; c++) {
                t[c][r] = m[r][c];
            }
        }
        return t;
    }

    /** Somma elemento per elemento. Precondizione: stesse dimensioni. */
    public static int[][] somma(int[][] a, int[][] b) {
        int[][] s = new int[a.length][a[0].length];
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                s[r][c] = a[r][c] + b[r][c];
            }
        }
        return s;
    }

    public static boolean stesseDimensioni(int[][] a, int[][] b) {
        return a.length == b.length && a[0].length == b[0].length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Righe e colonne: ");
        int righe = in.nextInt();
        int colonne = in.nextInt();

        System.out.println("Prima matrice (" + righe + "x" + colonne + "):");
        int[][] a = leggi(in, righe, colonne);
        System.out.println("Seconda matrice (" + righe + "x" + colonne + "):");
        int[][] b = leggi(in, righe, colonne);
        in.close();

        System.out.println("A:");
        stampa(a);
        System.out.println("trasposta di A:");
        stampa(trasposta(a));
        if (stesseDimensioni(a, b)) {
            System.out.println("A + B:");
            stampa(somma(a, b));
        }
    }
}
