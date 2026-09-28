/* Lezione 2 -- Perche` esiste StringBuilder? Un esperimento con System.nanoTime(). */
public class ConfrontoConcatenazione {

    public static String conPiu(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += i % 10;                  // ogni volta: NUOVA stringa, copia di tutta s
        }
        return s;
    }

    public static String conStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i % 10);            // modifica in place
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 100_000;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        long t0 = System.nanoTime();
        String a = conPiu(n);
        long t1 = System.nanoTime();
        String b = conStringBuilder(n);
        long t2 = System.nanoTime();

        System.out.printf("n = %d caratteri%n", n);
        System.out.printf("String +=     : %8.1f ms%n", (t1 - t0) / 1e6);
        System.out.printf("StringBuilder : %8.1f ms%n", (t2 - t1) / 1e6);
        System.out.println("stesso contenuto? " + a.equals(b));
    }
}
