public class Geometria {

    // modificatori, tipo di ritorno, nome, parametri
    public static double areaCerchio(double r) {
        return Math.PI * r * r;
    }

    public static void stampaSaluto() {  // void: nessun valore restituito
        System.out.println("Ciao!");
    }

    public static void main(String[] args) {
        stampaSaluto();               // chiamata
        double a = areaCerchio(2.0);  // 12.566...
        System.out.printf("Area: %.3f%n", a);
    }
}
