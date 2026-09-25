public class Saluta {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: java Saluta <nome> [<nome> ...]");
            return;
        }
        for (int i = 0; i < args.length; i++) {   // args.length: quanti argomenti
            System.out.printf("Ciao, %s!%n", args[i]);
        }
    }
}
