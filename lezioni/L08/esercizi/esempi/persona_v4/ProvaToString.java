import java.util.Arrays;

/** toString: chi lo chiama. */
public class ProvaToString {

    public static void main(String[] args) {
        Persona p = new Persona("Anna", "Russo");
        Studente s = new Studente("Luca", "Bianchi", "N86001234");

        System.out.println(p);              // p.toString()
        System.out.println(s);
        System.out.println("Ciao, " + p);   // p.toString()

        int[] v = { 1, 2, 3 };
        System.out.println(v);              // Object!
        System.out.println(Arrays.toString(v));
    }
}
