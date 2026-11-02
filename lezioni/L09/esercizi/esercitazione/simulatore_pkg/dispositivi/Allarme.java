package dispositivi;

/** Un allarme: acceso o spento. */
public class Allarme implements Accendibile {

    private boolean attivo;

    public Allarme() {
        attivo = false;
    }

    @Override
    public void accendi() {
        attivo = true;
    }

    @Override
    public void spegni() {
        attivo = false;
    }

    @Override
    public boolean isAcceso() {
        return attivo;
    }

    @Override
    public String toString() {
        if (attivo) {
            return "allarme: attivo";
        }
        return "allarme: disattivo";
    }
}
