/** Termina apposta con ClassCastException. */
public class ProvaScatola {

    public static void main(String[] args) {
        Scatola s = new Scatola("ciao");
        String testo = (String) s.getContenuto();
        // compila: 5 diventa un Integer
        s.setContenuto(5);
        String altro = (String) s.getContenuto();
        System.out.println(testo + " " + altro);
    }
}
