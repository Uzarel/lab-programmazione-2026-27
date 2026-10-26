/** Un array di forme diverse, trattate tutte allo stesso modo. */
public class ProvaForme {

    /** LEGGE l'array e somma le aree. */
    public static double areaTotale(Forma[] forme) {
        double totale = 0;
        for (Forma f : forme) {
            totale += f.area();
        }
        return totale;
    }

    /** LEGGE l'array e restituisce la forma
     *  piu` grande (precondizione: almeno una). */
    public static Forma piuGrande(Forma[] forme) {
        Forma max = forme[0];
        for (Forma f : forme) {
            if (f.piuGrandeDi(max)) {
                max = f;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Forma[] forme = {
            new Cerchio("rosso", 1),
            new Rettangolo("blu", 3, 4),
            new Cerchio("verde", 2),
            new Rettangolo("giallo", 2, 2)
        };
        for (Forma f : forme) {
            System.out.printf("%s: area %.2f%n",
                    f.descrizione(), f.area());
        }
        System.out.printf("area totale: %.2f%n",
                areaTotale(forme));
        Forma g = piuGrande(forme);
        System.out.println(g.descrizione());

        // Forma f = new Forma("nero");   // ERRORE
        // Rettangolo r = forme[1];   // ERRORE: cast
        Rettangolo r = (Rettangolo) forme[1];
        System.out.println(r.isQuadrato());
    }
}
