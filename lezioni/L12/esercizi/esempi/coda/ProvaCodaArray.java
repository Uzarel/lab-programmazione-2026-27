public class ProvaCodaArray {

    public static void main(String[] args) {
        Coda<String> c = new CodaArray<>(4);
        c.enqueue("Anna");
        c.enqueue("Luca");
        c.enqueue("Sara");
        System.out.println(c.dequeue());
        c.enqueue("Marco");   // in posizione 3
        c.enqueue("Elena");   // in posizione 0
        System.out.println(c.isFull());
        while (!c.isEmpty()) {
            System.out.println(c.dequeue());
        }
    }
}
