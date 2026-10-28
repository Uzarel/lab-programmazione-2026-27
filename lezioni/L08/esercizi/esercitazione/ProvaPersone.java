/** Copia profonda di una persona con indirizzo. */
public class ProvaPersone {

    public static void main(String[] args)
            throws CloneNotSupportedException {
        Persona p = new Persona("Anna", "Russo",
                "via Roma 1", "Napoli");
        Persona q = p.clone();
        System.out.println(p);
        System.out.println(q);
        System.out.println(p == q);
        System.out.println(p.equals(q));

        q.trasferisci("Milano");
        System.out.println(p);
        System.out.println(q);
        System.out.println(p.equals(q));
        System.out.println(p.getCitta());
    }
}
