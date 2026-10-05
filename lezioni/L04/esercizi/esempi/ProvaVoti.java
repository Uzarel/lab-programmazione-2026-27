public class ProvaVoti {
    public static void main(String[] args) {
        boolean ok = Voti.isValido(31);    // false
        int base = Voti.baseLaurea(27.4);  // 100
        System.out.println(ok + " " + base);
        System.out.println(Voti.MASSIMO);  // 30
        // Voti.arrotonda(2.5);  // ERRORE: private
    }
}
