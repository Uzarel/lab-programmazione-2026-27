/** compareTo su String e sui wrapper: tutti Comparable. */
public class Confrontabili {

    public static void main(String[] args) {
        System.out.println("Anna".compareTo("Luca"));
        Integer a = 4;
        System.out.println(a.compareTo(9));
        Double d = 2.5;
        System.out.println(d.compareTo(2.5));
    }
}
