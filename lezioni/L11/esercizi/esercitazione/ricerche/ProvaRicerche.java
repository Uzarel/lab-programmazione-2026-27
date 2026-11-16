import java.util.Arrays;

public class ProvaRicerche {

    public static void main(String[] args) {
        String[] nomi = { "Sara", "Anna", "Marco",
                          "Luca", "Elena" };
        System.out.println(Ricerche.isOrdinato(nomi));
        Arrays.sort(nomi);
        System.out.println(Arrays.toString(nomi));
        System.out.println(Ricerche.isOrdinato(nomi));
        Integer[] numeri = { 1, 3, 5, 10, 15, 23,
                             31, 47, 47, 56, 64 };
        try {
            int luca = Ricerche.ricercaBinaria(nomi, "Luca");
            int dieci = Ricerche.ricercaRicorsiva(numeri, 10);
            System.out.println(luca + " " + dieci);
            int paolo = Ricerche.ricercaBinaria(nomi, "Paolo");
            System.out.println(paolo);   // mai eseguito
        } catch (NonTrovatoException e) {
            System.out.println(e.getMessage());
        }
        Double[] misure = { 2.5, 1.0, 3.75 };
        System.out.println(Ricerche.isOrdinato(misure));
        // int[] interi = { 1, 2, 3 };
        // Ricerche.ricercaBinaria(interi, 2);   // errore
    }
}
