/** Prova di Persona e Studente: cosa eredita una sottoclasse. */
public class ProvaPersone {

    public static void main(String[] args) {
        Persona p = new Persona("Anna", "Russo");
        Studente s = new Studente("Luca", "Bianchi",
                "N86001234");

        System.out.println(p.descrizione());
        System.out.println(s.getNome());
        System.out.println(s.getMatricola());
        System.out.println(s.descrizione());

        // p.getMatricola();   // ERRORE
    }
}
