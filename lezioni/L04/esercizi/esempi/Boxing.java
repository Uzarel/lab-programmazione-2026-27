public class Boxing {

    public static void azzera(Integer x) {
        x = 0;    // cambia solo la copia
    }

    public static void main(String[] args) {
        Integer w = 10;     // boxing
        int n = w;          // unboxing
        Integer s = w + n;  // unboxing e boxing
        System.out.println(s);             // 20

        azzera(w);
        System.out.println(w);             // 10

        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b);        // false
        System.out.println(a.equals(b));   // true

        Integer[] voti = new Integer[3];  // 3 null!
        voti[0] = 28;                     // boxing
        int primo = voti[0];              // unboxing
        System.out.println(primo);        // 28
        // int x = voti[1];   // NullPointerException
    }
}
