/** Un'auto HA UN motore: composizione. */
public class Auto {

    private final String targa;
    private final Motore motore;   // creato qui

    public Auto(String targa, int cilindrata) {
        this.targa = targa;
        motore = new Motore(cilindrata);
    }

    public String getTarga() {
        return targa;
    }

    public boolean isAccesa() {
        return motore.isAcceso();
    }

    public void accendi() {
        motore.avvia();
    }

    public void spegni() {
        motore.spegni();
    }

    @Override
    public String toString() {
        return "auto " + targa
                + ", motore " + motore;
    }
}
