import java.util.Comparator;

public class ComparaPerCognome
        implements Comparator<Persona> {

    @Override
    public int compare(Persona a, Persona b) {
        String ca = a.getCognome();
        String cb = b.getCognome();
        return ca.compareTo(cb);
    }
}
