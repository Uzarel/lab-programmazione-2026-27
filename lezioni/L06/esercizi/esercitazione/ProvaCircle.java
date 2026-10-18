/** Prova di Circle. */
public class ProvaCircle {

    /** LEGGE il cerchio ricevuto e lo stampa su una riga. */
    public static void stampa(String nome, Circle c) {
        Point2D o = c.getCenter();
        System.out.println(nome + ": centro (" + o.getX()
                + ", " + o.getY() + "), raggio "
                + c.getRadius());
    }

    public static void main(String[] args) {
        Point2D p = new Point2D(3, 4);
        Circle a = new Circle(p, 5);
        Circle b = new Circle(2);
        Circle c = a.scale(2);
        Circle d = new Circle(new Point2D(3, 4), 5);
        Circle e = new Circle(p, -1);
        stampa("b", b);
        stampa("c", c);
        stampa("e", e);
        System.out.println(a.contains(Point2D.ORIGIN));
        System.out.println(b.contains(p));
        System.out.println(a.equals(d));
        System.out.println(a.notEqual(c));
        System.out.println(b.area());
        System.out.println(Circle.getObjCount());
    }
}
