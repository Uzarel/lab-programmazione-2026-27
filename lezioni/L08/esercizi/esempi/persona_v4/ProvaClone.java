import java.util.Arrays;

/** clone: una copia dell'oggetto. */
public class ProvaClone {

    public static void main(String[] args)
            throws CloneNotSupportedException {
        Persona p = new Persona("Anna", "Russo");
        Persona q = p.clone();
        System.out.println(p == q);
        System.out.println(p.equals(q));
        int[] v = { 1, 2, 3 };
        int[] w = v.clone();   // array: clonabile
        w[0] = 9;
        System.out.println(Arrays.toString(v));

        Persona x = new Studente("Luca",
                "Bianchi", "N86001234");
        Persona y = x.clone();   // ereditato
        System.out.println(y.getClass());
        System.out.println(y);
    }
}
