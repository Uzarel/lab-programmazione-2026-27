import java.util.Arrays;

public class ProvaPersone {

    public static void main(String[] args) {
        Persona p1 = new Persona("Anna", "Russo", 35);
        Persona p2 = new Persona("Luca", "Verde", 20);
        System.out.println(p1.compareTo(p2));   // 1
        System.out.println(p2.compareTo(p1));   // -1
        Persona[] elenco = { p1, p2,
            new Persona("Mario", "Annunziata", 33),
            new Persona("Sara", "Esposito", 33) };
        Arrays.sort(elenco);      // ordine naturale
        for (Persona p : elenco) {
            System.out.println(p);
        }
        System.out.println(Utili.max(elenco)); // max
        Arrays.sort(elenco, new ComparaPerCognome());
        for (Persona p : elenco) {
            System.out.println(p);
        }
        ComparaPerCognome c = new ComparaPerCognome();
        System.out.println(c.compare(p1, p2));
    }
}
