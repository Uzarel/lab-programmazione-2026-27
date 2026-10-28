import java.util.Objects;

/** Un numero complesso, immutabile. */
public class Complex {

    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    /** CREA la somma di this e z. */
    public Complex somma(Complex z) {
        return new Complex(re + z.re,
                           im + z.im);
    }

    /** CREA il prodotto di this e z. */
    public Complex prodotto(Complex z) {
        double a = re * z.re - im * z.im;
        double b = re * z.im + im * z.re;
        return new Complex(a, b);
    }

    public double modulo() {
        return Math.sqrt(re * re + im * im);
    }

    @Override
    public String toString() {
        if (im < 0) {
            return re + " - " + (-im) + "i";
        }
        return re + " + " + im + "i";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Complex c = (Complex) obj;
        return Double.compare(re, c.re) == 0
                && Double.compare(im, c.im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
