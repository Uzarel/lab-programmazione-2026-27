public class ProvaContenitore {

    public static void main(String[] args) {
        Contenitore<String> nomi = new Contenitore<>();
        nomi.aggiungi("Anna");
        nomi.aggiungi("Luca");
        nomi.aggiungi("Sara");
        nomi.aggiungi("Marco");
        nomi.aggiungi("Elena");    // l'array raddoppia
        System.out.println(nomi + " " + nomi.size());
        System.out.println(nomi.indiceDi("Sara"));
        System.out.println(nomi.contiene("Paolo"));
        String primo = nomi.get(0);   // nessun cast
        System.out.println(primo.toUpperCase());
        // nomi.aggiungi(5);   // errore

        Contenitore<Coppia<String, Integer>> esami =
                new Contenitore<>();
        esami.aggiungi(new Coppia<>("Analisi", 28));
        esami.aggiungi(new Coppia<>("Fisica", 30));
        System.out.println(esami);
        Coppia<String, Integer> c = new Coppia<>("Analisi", 28);
        System.out.println(esami.contiene(c));
        int somma = 0;
        for (int i = 0; i < esami.size(); i++) {
            somma += esami.get(i).getSecondo();
        }
        double media = (double) somma / esami.size();
        System.out.println("media " + media);
    }
}
