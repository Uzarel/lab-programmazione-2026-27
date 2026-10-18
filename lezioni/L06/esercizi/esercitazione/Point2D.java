/** Un punto del piano. Immutabile. */
public class Point2D {

    /** L'origine: una costante condivisa. */
    public static final Point2D ORIGIN = new Point2D(0, 0);

    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /** Costruttore di copia. */
    public Point2D(Point2D p) {
        this(p.x, p.y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point2D p) {
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /** CREA il punto spostato di (dx, dy). */
    public Point2D translate(double dx, double dy) {
        return new Point2D(x + dx, y + dy);
    }

    /** CREA il simmetrico rispetto all'origine. */
    public Point2D reflectOrigin() {
        return ORIGIN.translate(-x, -y);
    }

    public boolean equals(Point2D p) {
        return x == p.x && y == p.y;
    }

    public boolean notEqual(Point2D p) {
        return !equals(p);
    }
}
