public class ProvaLista {

    public static void main(String[] args) {
        ListaConcatenata<String> nomi = new ListaConcatenata<>();
        System.out.println(nomi + " " + nomi.isEmpty());
        nomi.addLast("Anna");
        nomi.addLast("Luca");
        // nomi era [Anna, Luca]
        nomi.addFirst("Marco");
        System.out.println(nomi);
        System.out.println(nomi.removeFirst());
        nomi.addLast("Sara");
        // nomi era [Anna, Luca, Sara]
        nomi.remove("Luca");
        System.out.println(nomi);
        System.out.println(nomi.remove("Paolo"));
        System.out.println(nomi.remove("Sara"));
        System.out.println(nomi + " " + nomi.isEmpty());
    }
}
