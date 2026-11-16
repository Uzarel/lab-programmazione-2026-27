/** I limiti dei generici (con la Scatola<T> di esempi/scatola). */
public class Limiti {

    public static void main(String[] args) {
        Scatola<String> s = new Scatola<>("ciao");
        Scatola<Integer> n = new Scatola<>(5);
        System.out.println(s.getClass() == n.getClass());
        // Scatola<int> k = new Scatola<>(5);
        // Scatola<String>[] v = new Scatola<String>[3];
        Object o = s;
        System.out.println(o instanceof Scatola<?>);
        // boolean b = o instanceof Scatola<String>;
    }
}
