/** Un ventilatore: tre velocita`. */
public class Ventilatore
        implements Accendibile, Regolabile {

    private static final int MAX = 3;

    private final String stanza;
    private boolean acceso;
    private int velocita;

    public Ventilatore(String stanza) {
        this.stanza = stanza;
        acceso = false;
        velocita = 1;
    }

    @Override
    public void accendi() {
        acceso = true;
    }

    @Override
    public void spegni() {
        acceso = false;
    }

    @Override
    public boolean isAcceso() {
        return acceso;
    }

    /** MODIFICA: piu` veloce, se acceso. */
    @Override
    public void alza() {
        if (acceso && velocita < MAX) {
            velocita++;
        }
    }

    @Override
    public void abbassa() {
        if (acceso && velocita > 1) {
            velocita--;
        }
    }

    @Override
    public int getLivello() {
        return velocita;
    }

    @Override
    public String toString() {
        if (!acceso) {
            return "ventilatore " + stanza + ": spento";
        }
        return "ventilatore " + stanza + ": acceso, velocita "
                + velocita + "/" + MAX;
    }
}
