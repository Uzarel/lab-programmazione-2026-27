import java.util.Arrays;

/** equals(Object) ridefinito: funziona da qualunque riferimento. */
public class ProvaEquals {

    public static void main(String[] args) {
        Persona p = new Persona("Anna", "Russo");
        Persona q = new Persona("Anna", "Russo");
        Studente s = new Studente("Anna", "Russo", "N86001234");

        System.out.println(p == q);
        System.out.println(p.equals(q));
        Object o = q;
        System.out.println(p.equals(o));
        Persona[] a = { p };
        Persona[] b = { q };
        System.out.println(Arrays.equals(a, b));

        System.out.println(p.equals(s)); // Studente
        System.out.println(p.hashCode()
                == q.hashCode());
    }
}
