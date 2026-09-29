/* Lezione 3 -- Un array di riferimenti: String[] (come args!). */
public class ArrayDiStringhe {

    public static void main(String[] args) {
        String[] nomi = new String[3];            // tre riferimenti, tutti null
        System.out.println(nomi[0]);              // null
        // System.out.println(nomi[0].length());  // NullPointerException

        nomi[0] = "Anna";
        nomi[1] = "Luca";
        nomi[2] = "Marta";

        String[] colori = {"rosso", "verde", "blu"};   // inizializzazione diretta

        for (String c : colori) {
            System.out.print(c.toUpperCase() + " ");
        }
        System.out.println();

        // args e` esattamente un String[]
        System.out.println("argomenti ricevuti: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] = %s (%d caratteri)%n", i, args[i], args[i].length());
        }
    }
}
