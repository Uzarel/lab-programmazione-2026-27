/** Prova di Point2D. */
public class ProvaPoint2D {

    /** LEGGE il punto ricevuto e lo stampa. */
    public static void stampa(String nome, Point2D p) {
        System.out.println(nome + " = (" + p.getX()
                + ", " + p.getY() + ")");
    }

    public static void main(String[] args) {
        Point2D p = new Point2D(3, 4);
        Point2D q = p.translate(1, 1);
        Point2D r = p.reflectOrigin().reflectOrigin();
        stampa("p", p);
        stampa("q", q);
        stampa("r", r);

        System.out.println(p.distance(Point2D.ORIGIN));
        System.out.println(p == r);
        System.out.println(p.equals(r));
        System.out.println(p.notEqual(q));

        p.translate(10, 10);
        stampa("p", p);
    }
}
