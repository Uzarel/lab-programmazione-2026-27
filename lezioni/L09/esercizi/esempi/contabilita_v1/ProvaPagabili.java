/** L'interfaccia come tipo: un array di Pagabile. */
public class ProvaPagabili {

    /** LEGGE: la somma degli importi. */
    public static double totale(Pagabile[] elenco) {
        double somma = 0;
        for (Pagabile p : elenco) {
            somma += p.importo();
        }
        return somma;
    }

    public static void main(String[] args) {
        Pagabile[] daPagare = {
            new Fattura("F-01", 3, 250),
            new Dipendente("Anna Russo", 1800),
            new Fattura("F-02", 1, 99.5)
        };
        for (Pagabile p : daPagare) {
            System.out.println(p + ": " + p.importo());
        }
        System.out.println(totale(daPagare));
    }
}
