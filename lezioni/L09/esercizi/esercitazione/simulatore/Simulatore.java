/** Dispositivi diversi, tutti Accendibile. */
public class Simulatore {

    public static void main(String[] args) {
        Accendibile[] casa = {
            new Lampada("cucina"),
            new Ventilatore("studio"),
            new Allarme(),
            new Lampada("camera")
        };
        for (Accendibile d : casa) {
            d.accendi();
        }
        for (Accendibile d : casa) {
            if (d instanceof Regolabile) {
                Regolabile r = (Regolabile) d;
                r.alza();
                r.alza();
                r.alza();
            }
        }
        casa[2].commuta();      // allarme: si spegne
        casa[3].spegni();
        for (Accendibile d : casa) {
            System.out.println(d);
        }
        System.out.println("accesi: "
                + Accendibile.quantiAccesi(casa));
    }
}
