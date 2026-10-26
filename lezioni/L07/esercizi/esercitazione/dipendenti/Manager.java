/** Un manager E` UN dipendente con bonus. */
public class Manager extends Dipendente {

    private final double bonus;   // mensile

    public Manager(String nome,
                   double stipendioBase,
                   double bonus) {
        super(nome, stipendioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double stipendio() {
        return super.stipendio() + bonus;
    }

    @Override
    public String descrizione() {
        return super.descrizione()
                + ", bonus " + bonus;
    }
}
