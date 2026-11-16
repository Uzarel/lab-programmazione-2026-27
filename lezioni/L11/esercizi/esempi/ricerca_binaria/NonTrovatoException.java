/** Sollevata da una ricerca: x non c'e'. */
public class NonTrovatoException
        extends Exception {

    public NonTrovatoException(Object x) {
        super("non trovato: " + x);
    }
}
