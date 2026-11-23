public class ProvaPile {

    public static void main(String[] args) {
        Pila<String> p = new PilaArray<>(2);
        p.push("Anna");
        p.push("Luca");
        System.out.println(p.isFull());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.isEmpty());
        Pila<String> q = new PilaLista<>();
        q.push("Anna");
        q.push("Luca");
        System.out.println(q.isFull());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.isEmpty());
    }
}
