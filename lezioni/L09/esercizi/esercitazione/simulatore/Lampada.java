/** Una lampada: luce regolabile da 1 a 10. */
public class Lampada
        implements Accendibile, Regolabile {

    private static final int MAX = 10;

    private final String stanza;
    private boolean accesa;
    private int luce;

    public Lampada(String stanza) {
        this.stanza = stanza;
        accesa = false;
        luce = 5;
    }

    @Override
    public void accendi() {
        accesa = true;
    }

    @Override
    public void spegni() {
        accesa = false;
    }

    @Override
    public boolean isAcceso() {
        return accesa;
    }

    /** MODIFICA: piu` luce, se accesa. */
    @Override
    public void alza() {
        if (accesa && luce < MAX) {
            luce++;
        }
    }

    @Override
    public void abbassa() {
        if (accesa && luce > 1) {
            luce--;
        }
    }

    @Override
    public int getLivello() {
        return luce;
    }

    @Override
    public String toString() {
        if (!accesa) {
            return "lampada " + stanza + ": spenta";
        }
        return "lampada " + stanza + ": accesa, luce "
                + luce + "/" + MAX;
    }
}
