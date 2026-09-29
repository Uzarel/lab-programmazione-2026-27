/* Lezione 3 -- I tre modi di chiamare un metodo. */
public class Chiamate {

    public static int quadrato(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        String s = "laboratorio";

        int n = s.length();               // 1. su un OGGETTO, con il punto
        double r = Math.sqrt(2.0);        // 2. su una CLASSE (metodo static di un'altra classe)
        int q = quadrato(7);              // 3. nome da solo: metodo static della STESSA classe

        System.out.println(n + " " + r + " " + q);
        System.out.println(Chiamate.quadrato(3));   // il modo 2 vale anche per la propria classe
    }
}
