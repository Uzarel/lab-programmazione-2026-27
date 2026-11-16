import java.util.Arrays;

public class ProvaUtili {

    public static void main(String[] args) {
        String[] nomi = { "Luca", "Anna", "Sara" };
        Integer[] numeri = { 4, 9, 2 };
        String n = Utili.primo(nomi);
        Integer k = Utili.primo(numeri);
        Utili.scambia(nomi, 0, 2);
        System.out.println(n + " " + k);
        System.out.println(Arrays.toString(nomi));
        // int[] interi = { 4, 9, 2 };
        // Utili.primo(interi);   // errore
        System.out.println(Utili.max(nomi));
        System.out.println(Utili.max(numeri));
    }
}
