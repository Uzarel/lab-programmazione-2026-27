public class ProvaCoppia {

    public static void main(String[] args) {
        Coppia<String, Integer> esame =
                new Coppia<>("Analisi", 28);
        String nome = esame.getPrimo();
        int voto = esame.getSecondo();
        Coppia<Integer, String> inversa =
                esame.scambia();
        Coppia<Double, Double> punto =
                new Coppia<>(1.5, -2.0);
        System.out.println(esame + " " + voto);
        System.out.println(inversa + " " + punto);
        System.out.println(nome.length());
    }
}
