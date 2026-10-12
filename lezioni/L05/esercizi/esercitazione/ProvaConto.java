/** Programma di prova per la classe ContoBancario. */
public class ProvaConto {

    /** LEGGE il conto ricevuto e lo stampa su una riga. */
    public static void stampa(ContoBancario c) {
        System.out.println(c.getIntestatario()
                + ": saldo " + c.getSaldo()
                + ", movimenti " + c.getMovimenti());
    }

    public static void main(String[] args) {
        ContoBancario anna = new ContoBancario("Anna", 500);
        ContoBancario luca = new ContoBancario("Luca");

        anna.versa(250.50);
        System.out.println(anna.preleva(1000));
        System.out.println(anna.versa(-20));
        System.out.println(anna.trasferisci(luca, 300));
        System.out.println(luca.trasferisci(anna, 999));

        stampa(anna);
        stampa(luca);
    }
}
