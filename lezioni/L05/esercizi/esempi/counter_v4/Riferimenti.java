/** Copia, alias e oggetti senza riferimenti (usa Counter, versione 4). */
public class Riferimenti {
    public static void main(String[] args) {
        Counter c = new Counter(4);
        c.increment();

        Counter copia = new Counter(c);  // altro oggetto
        Counter alias = c;               // stesso oggetto
        c.increment();
        System.out.println(c.getValue());      // 2
        System.out.println(copia.getValue());  // 1
        System.out.println(alias.getValue());  // 2

        c = new Counter(7);   // c cambia oggetto
        alias = null;         // il primo e` orfano
        System.out.println(c.getValue());      // 0
    }
}
