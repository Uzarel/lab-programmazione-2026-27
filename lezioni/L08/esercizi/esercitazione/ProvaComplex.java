import java.util.Arrays;

/** Prova di Complex: toString, equals, hashCode. */
public class ProvaComplex {

    public static void main(String[] args) {
        Complex z = new Complex(3, 4);
        Complex w = new Complex(3, 4);
        Complex u = new Complex(1, -2);

        System.out.println(z);
        System.out.println(z.somma(u));
        System.out.println(z.prodotto(u));

        System.out.println(z == w);
        System.out.println(z.equals(w));
        System.out.println(z.hashCode() == w.hashCode());
        System.out.println(z.equals(u));
        System.out.println(z.equals("3.0 + 4.0i"));
        System.out.println(z.equals(null));

        Complex[] a = { z, u };
        Complex[] b = { w, new Complex(1, -2) };
        System.out.println(Arrays.equals(a, b));
    }
}
