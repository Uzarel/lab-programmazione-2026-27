import java.util.Arrays;

public class OrdinaCerca {
    public static void main(String[] args) {
        int[] v = {12, 7, 3, 21, 9};
        Arrays.sort(v);        // MODIFICA v
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.binarySearch(v, 12));
        System.out.println(Arrays.binarySearch(v, 8));

        String[] nomi = {"Marta", "anna", "Luca"};
        Arrays.sort(nomi);     // usa compareTo
        System.out.println(Arrays.toString(nomi));

        int[][] m = {{1, 2}, {3, 4}};
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.deepToString(m));
    }
}
