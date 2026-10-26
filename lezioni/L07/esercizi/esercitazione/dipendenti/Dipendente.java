/** Un dipendente: nome e stipendio base. */
public class Dipendente {

    private final String nome;
    private double stipendioBase;   // mensile

    /** Precondizione: stipendioBase > 0. */
    public Dipendente(String nome,
                      double stipendioBase) {
        this.nome = nome;
        this.stipendioBase = stipendioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    /** Lo stipendio mensile: la base. */
    public double stipendio() {
        return stipendioBase;
    }

    /** MODIFICA la base: +percentuale %. */
    public void aumenta(double percentuale) {
        stipendioBase += stipendioBase
                * percentuale / 100;
    }

    public String descrizione() {
        return nome + ", stipendio "
                + stipendio();
    }
}
