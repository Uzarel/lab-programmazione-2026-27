public class Wrapper {
    public static void main(String[] args) {
        int n = 10;                       // il valore
        Integer w = Integer.valueOf(10);  // un oggetto

        // metodi di istanza: w e` un oggetto
        System.out.println(w.intValue() + n);       // 20
        System.out.println(w.doubleValue() / 4);    // 2.5
        System.out.println(w.toString().length());  // 2

        // costanti e metodi static: il corredo del tipo
        int max = Integer.MAX_VALUE;   // 2147483647
        int k = Integer.parseInt("42");           // 42
        double x = Double.parseDouble("2.5");     // 2.5
        String t = Integer.toString(42);          // "42"
        String bin = Integer.toBinaryString(10);  // "1010"
        System.out.println(max + " " + k + " " + x);
        System.out.println(t + 1 + " " + bin);  // 421 1010
    }
}
