package dispositivi;

/** Un dispositivo: si accende e spegne. */
public interface Accendibile {

    void accendi();

    void spegni();

    boolean isAcceso();

    /** default: inverte lo stato. */
    default void commuta() {
        if (isAcceso()) {
            spegni();
        } else {
            accendi();
        }
    }

    /** static: LEGGE quanti sono accesi. */
    static int quantiAccesi(Accendibile[] elenco) {
        int n = 0;
        for (Accendibile d : elenco) {
            if (d.isAcceso()) {
                n++;
            }
        }
        return n;
    }
}
