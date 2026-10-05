import java.util.Arrays;

public class ProvaStatistiche {
    public static void main(String[] args) {
        int[] voti = {28, 30, 24, 27, 30, 18};

        System.out.println(Statistiche.somma(voti));
        System.out.println(Statistiche.media(voti));
        System.out.println(Statistiche.minimo(voti));
        System.out.println(Statistiche.massimo(voti));
        System.out.println(Statistiche.mediana(voti));
        System.out.println(Arrays.toString(voti));

        System.out.println(Statistiche.media(18, 30));
        System.out.println(Statistiche.mediana(5, 1, 3));
        int vicina = (int) (Statistiche.media(voti) + 0.5);
        System.out.println(vicina);
    }
}
