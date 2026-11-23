public class ProvaCode {

    /** Chi arriva prima e' servito prima. */
    public static void sportello(Coda<String> fila) {
        fila.enqueue("Anna");
        fila.enqueue("Luca");
        // fila era [Anna, Luca]
        fila.enqueue("Sara");
        System.out.println("piena: " + fila.isFull());
        System.out.println("servito " + fila.dequeue());
        fila.enqueue("Marco");
        while (!fila.isEmpty()) {
            System.out.println("servito " + fila.dequeue());
        }
    }

    public static void main(String[] args) {
        sportello(new CodaArray<>(3));
        sportello(new CodaLista<>());
        CodaLista<Integer> numeri = new CodaLista<>();
        numeri.enqueue(7);
        numeri.enqueue(4);
        numeri.enqueue(9);
        System.out.println(numeri.dequeue() + " " + numeri);
    }
}
