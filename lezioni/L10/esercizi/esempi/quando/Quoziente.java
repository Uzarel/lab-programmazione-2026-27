/** Un'eccezione al posto di un if: da evitare. */
public class Quoziente {

    public static void main(String[] args) {
        int a = 7;
        int b = 0;
        // NO: l'eccezione usata come un if
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("divisore nullo");
        }
        // SI': il controllo normale, con un if
        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("divisore nullo");
        }
    }
}
