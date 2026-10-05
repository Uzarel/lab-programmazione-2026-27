public class Caratteri {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println((int) c);          // 97
        System.out.println((char) 98);        // b
        System.out.println(c + 1);            // 98: int
        System.out.println((char) (c + 1));   // b

        // c = c + 1;   // ERRORE: int -> char
        c++;            // ok: ora c vale 'b'
        c += 2;         // ok: ora c vale 'd'
        System.out.println(c);                // d

        char accentata = '\u00E8';   // la e accentata
        System.out.println((int) accentata);  // 232

        System.out.println('7' - '0');        // 7
        System.out.println('e' - 'a');        // 4
        System.out.println((char) ('a' + 4)); // e
        System.out.println((char) ('e' - 'a' + 'A')); // E
    }
}
