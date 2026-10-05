import java.util.Arrays;

public class UsaArrays {
    public static void main(String[] args) {
        int[] a = {4, 5, 1, 13, 0};
        System.out.println(a);            // riferimento!
        System.out.println(Arrays.toString(a));

        int[] b = Arrays.copyOf(a, a.length);  // copia vera
        b[0] = 99;
        System.out.println(a[0]);         // a non cambia
        int[] lungo = Arrays.copyOf(a, 7);
        System.out.println(Arrays.toString(lungo));

        int[] c = {4, 5, 1, 13, 0};
        System.out.println(a == c);
        System.out.println(a.equals(c));  // come ==
        System.out.println(Arrays.equals(a, c));

        int[] d = new int[4];
        Arrays.fill(d, 7);
        System.out.println(Arrays.toString(d));
    }
}
