public class ProvaScatola {

    public static void main(String[] args) {
        Scatola<String> s = new Scatola<>("ciao");
        String testo = s.getContenuto();  // nessun cast
        // s.setContenuto(5);  // errore di compilazione
        Scatola<Integer> n = new Scatola<>(5);
        int doppio = 2 * n.getContenuto();  // unboxing
        System.out.println(s + " " + testo.length());
        System.out.println(n + " " + doppio);
    }
}
