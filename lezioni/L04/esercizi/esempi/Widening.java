public class Widening {

    public static double meta(double x) {
        return x / 2;
    }

    public static void main(String[] args) {
        char c = 'A';
        int i = c;       // char -> int: 65
        double d = i;    // int -> double: 65.0
        System.out.println(i + " " + d);

        System.out.println(c + 1);     // 66
        System.out.println(i + 0.5);   // 65.5
        System.out.println(7 / 2);     // 3
        System.out.println(7 / 2.0);   // 3.5
        System.out.println(meta(7));   // 3.5

        // int n = d;    // ERRORE: double -> int
        // char k = i;   // ERRORE: int -> char
    }
}
