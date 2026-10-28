import java.util.Objects;

/** Un indirizzo: via e citta`. */
public class Indirizzo implements Cloneable {

    private final String via;
    private String citta;

    public Indirizzo(String via,
                     String citta) {
        this.via = via;
        this.citta = citta;
    }

    public String getVia() {
        return via;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return via + ", " + citta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Indirizzo altro = (Indirizzo) obj;
        return via.equals(altro.via)
                && citta.equals(altro.citta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(via, citta);
    }

    @Override
    public Indirizzo clone()
            throws CloneNotSupportedException {
        return (Indirizzo) super.clone();
    }
}
