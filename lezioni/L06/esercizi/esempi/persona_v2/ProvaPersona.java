/** Senza privacy leak: lo stato di mario non cambia. */
public class ProvaPersona {

    public static void main(String[] args) {
        Data d = new Data(15, 3, 2006);
        Persona mario = new Persona("Mario", d);

        Data n = mario.getNascita();
        n.setGiorno(10);
        d.setAnno(1990);

        Data ora = mario.getNascita();
        System.out.println(ora.getGiorno());   // 15
        System.out.println(ora.getAnno());   // 2006
    }
}
