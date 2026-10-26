/** Il personale di un'azienda: dipendenti e manager. */
public class ProvaDipendenti {

    /** LEGGE l'array e somma gli stipendi. */
    public static double costoMensile(Dipendente[] personale) {
        double totale = 0;
        for (Dipendente d : personale) {
            totale += d.stipendio();
        }
        return totale;
    }

    public static void main(String[] args) {
        Dipendente a = new Dipendente("Anna", 1800);
        Manager m = new Manager("Luca", 2500, 700);
        Dipendente[] personale = {
            a, m, new Dipendente("Sara", 1600)
        };
        System.out.println(a.descrizione());
        System.out.println(m.descrizione());
        System.out.println(m.getBonus());
        System.out.println(costoMensile(personale));

        for (Dipendente d : personale) {
            d.aumenta(10);
        }
        System.out.println(m.descrizione());
        System.out.println(costoMensile(personale));

        Dipendente d = m;   // upcasting
        System.out.println(d.stipendio());
        // d.getBonus();   // ERRORE: d e` un Dipendente
    }
}
