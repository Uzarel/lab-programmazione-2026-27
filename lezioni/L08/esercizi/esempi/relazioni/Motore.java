/** Il motore di un'auto: cilindrata in cc, acceso o spento. */
public class Motore {

    private final int cilindrata;
    private boolean acceso;

    public Motore(int cilindrata) {
        this.cilindrata = cilindrata;
        acceso = false;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void avvia() {
        acceso = true;
    }

    public void spegni() {
        acceso = false;
    }

    @Override
    public String toString() {
        if (acceso) {
            return cilindrata + " cc, acceso";
        }
        return cilindrata + " cc, spento";
    }
}
