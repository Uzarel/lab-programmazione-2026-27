/** Chi rileva il problema (media) e chi lo gestisce (main). */
public class Media {

    /** La media di v, che non deve essere vuoto. */
    public static double media(int[] v) {
        if (v.length == 0) {
            throw new IllegalArgumentException(
                    "media di un array vuoto");
        }
        int somma = 0;
        for (int x : v) {
            somma += x;
        }
        return (double) somma / v.length;
    }

    public static void main(String[] args) {
        int[] voti = { 27, 30, 24 };
        int[] vuoto = {};
        System.out.println(media(voti));
        try {
            System.out.println(media(vuoto));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
