public class Varargs {

    /** Pre: almeno un numero. */
    public static double media(double... numeri) {
        double somma = 0;
        for (double x : numeri) {   // un double[]
            somma += x;
        }
        return somma / numeri.length;
    }

    /** Il primo argomento (a) e` obbligatorio. */
    public static int massimo(int a, int... altri) {
        int max = a;
        for (int x : altri) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[] voti = {28, 30, 24};
        double a = media(10, 40);          // 25.0
        double b = media(10, 40, 50, 75);  // 43.75
        double c = media(voti);            // 27.33
        double d = media();                // NaN
        int m = massimo(3, 9, 4);          // 9
        // massimo();    // ERRORE: manca il primo
        System.out.println(a + " " + b + " " + c);
        System.out.println(d + " " + m);
    }
}
