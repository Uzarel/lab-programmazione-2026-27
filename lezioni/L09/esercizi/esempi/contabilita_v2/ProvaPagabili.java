/** Piu` interfacce, metodi default e static. */
public class ProvaPagabili {

    public static void main(String[] args) {
        Fattura f = new Fattura("F-01", 3, 250, 2);
        Dipendente d = new Dipendente("Anna", 1800);

        Pagabile[] conti = { f, d };
        System.out.println(Pagabile.totale(conti));
        System.out.println(f.rata());   // default
        // System.out.println(d.rata()); // errore
        // System.out.println(f.totale()); // errore
    }
}
