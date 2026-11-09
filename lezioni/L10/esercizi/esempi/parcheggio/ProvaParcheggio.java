/** Il client cattura l'eccezione controllata. */
public class ProvaParcheggio {

    public static void main(String[] args) {
        Parcheggio p = new Parcheggio("P1", 2);
        try {
            p.entra();
            p.entra();
            p.entra();
            System.out.println("tre auto dentro");
        } catch (ParcheggioPienoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(p);
    }
}
