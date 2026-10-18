/** Un cerchio del piano. Immutabile. */
public class Circle {

    private static int objCount;   // cerchi creati

    private final Point2D center;
    private final double radius;

    /** Un raggio non positivo diventa 1. */
    public Circle(Point2D center, double radius) {
        this.center = center;
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
        objCount++;
    }

    /** Il centro e` l'origine. */
    public Circle(double radius) {
        this(Point2D.ORIGIN, radius);
    }

    public static int getObjCount() {
        return objCount;
    }

    public Point2D getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    /** true se p e` nel cerchio o sul bordo. */
    public boolean contains(Point2D p) {
        return center.distance(p) <= radius;
    }

    /** CREA il cerchio con il raggio per k. */
    public Circle scale(double k) {
        return new Circle(center, radius * k);
    }

    public boolean equals(Circle c) {
        return center.equals(c.center)
                && radius == c.radius;
    }

    public boolean notEqual(Circle c) {
        return !equals(c);
    }
}
