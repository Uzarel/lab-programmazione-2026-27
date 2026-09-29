/* Lezione 3 -- Il passaggio dei parametri: sempre per valore. */
public class PerValore {

    public static void azzera(int i) {
        System.out.println("  dentro: i vale " + i);
        i = 0;                                  // modifica la COPIA
        System.out.println("  dentro: adesso i vale " + i);
    }

    public static void maiuscola(String s) {
        s = s.toUpperCase();                    // riassegna la COPIA del riferimento
        System.out.println("  dentro: s vale " + s);
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println("prima: n vale " + n);
        azzera(n);
        System.out.println("dopo:  n vale " + n);          // ancora 30

        String nome = new String("diego");     // un oggetto nello heap
        System.out.println("prima: nome vale " + nome);
        maiuscola(nome);
        System.out.println("dopo:  nome vale " + nome);    // ancora diego
    }
}
