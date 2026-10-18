/** Prova di ContoBancario: l'uso esplicito di this. */
public class ProvaConto {

    public static void main(String[] args) {
        ContoBancario anna = new ContoBancario("Anna", 500);
        ContoBancario luca = new ContoBancario("Luca");

        System.out.println(anna.trasferisci(luca, 300));   // true
        System.out.println(anna.trasferisci(anna, 100));   // false
        System.out.println(anna.getSaldo());               // 200.0
        System.out.println(anna.getMovimenti());           // 2
        System.out.println(luca.getSaldo());               // 300.0
    }
}
