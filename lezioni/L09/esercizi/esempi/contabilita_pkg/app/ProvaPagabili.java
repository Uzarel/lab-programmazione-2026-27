package app;

import contabilita.Fattura;
import contabilita.Pagabile;

/** Il client, in un altro package. */
public class ProvaPagabili {

    public static void main(String[] args) {
        Fattura f = new Fattura("F-01", 3, 250, 2);
        contabilita.Dipendente d;   // qualificato
        d = new contabilita.Dipendente("Anna", 1800);
        Pagabile[] conti = { f, d };
        System.out.println(Pagabile.totale(conti));
        f.stampa();
    }
}
