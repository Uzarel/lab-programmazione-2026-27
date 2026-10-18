/** Il privacy leak: lo stato di mario cambia senza passare da Persona. */
public class ProvaPersona {

    public static void main(String[] args) {
        Data d = new Data(15, 3, 2006);
        Persona mario = new Persona("Mario", d);

        Data n = mario.getNascita();
        n.setGiorno(10);
        d.setAnno(1990);

        Data ora = mario.getNascita();
        System.out.println(ora.getGiorno());   // 10
        System.out.println(ora.getAnno());   // 1990
    }
}
