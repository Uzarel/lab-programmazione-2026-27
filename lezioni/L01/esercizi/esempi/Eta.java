import java.util.Scanner;   // la classe Scanner sta nel package java.util

public class Eta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   // un oggetto Scanner "collegato" alla tastiera
        System.out.print("Come ti chiami? ");
        String nome = in.nextLine();           // legge un'intera riga
        System.out.print("Quanti anni hai? ");
        int eta = in.nextInt();                // legge il prossimo intero
        System.out.printf("Ciao %s, tra un anno avrai %d anni.%n", nome, eta + 1);
        in.close();                            // chiusura (buona pratica)
    }
}
