/** Un dipendente: va pagato lo stipendio. */
public class Dipendente implements Pagabile {

    private final String nome;
    private double stipendio;

    public Dipendente(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    @Override
    public double importo() {
        return stipendio;
    }

    /** MODIFICA: aumento dello stipendio. */
    public void aumenta(double aumento) {
        stipendio += aumento;
    }

    @Override
    public String toString() {
        return "dipendente " + nome;
    }
}
