import java.util.Arrays;

/** Che cosa Persona eredita da Object senza saperlo. */
public class ProvaObject {

    public static void main(String[] args) {
        Persona p = new Persona("Anna", "Russo");
        Persona q = new Persona("Anna", "Russo");

        System.out.println(p);            // Object
        System.out.println(p.descrizione());
        System.out.println(p.hashCode()); // Object
        System.out.println(p.getClass()); // Object

        System.out.println(p == q);
        System.out.println(p.equals(q));  // overload
        Object o = q;
        System.out.println(p.equals(o));  // Object!
        Persona[] a = { p };
        Persona[] b = { q };
        System.out.println(Arrays.equals(a, b));
    }
}
