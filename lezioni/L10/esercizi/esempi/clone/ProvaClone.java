/** Chi chiama clone(): o cattura, o dichiara. */
public class ProvaClone {

    public static void main(String[] args) {
        Persona p = new Persona("Anna", "Russo");
        try {
            Persona q = p.clone();
            System.out.println("copia: " + q);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}
