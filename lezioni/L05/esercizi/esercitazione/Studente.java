/** Uno studente e i suoi esami. */
public class Studente {

    private String nome;
    private String matricola;
    private int esami;       // quanti esami
    private int sommaVoti;   // somma dei voti

    /** Un nuovo studente, senza esami. */
    public Studente(String n, String m) {
        nome = n;
        matricola = m;
        esami = 0;
        sommaVoti = 0;
    }

    /** Costruttore di copia. */
    public Studente(Studente s) {
        nome = s.nome;
        matricola = s.matricola;
        esami = s.esami;
        sommaVoti = s.sommaVoti;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricola() {
        return matricola;
    }

    public int getEsami() {
        return esami;
    }

    public void setNome(String n) {
        nome = n;
    }

    /** false se il voto non e` valido. */
    public boolean registra(int voto) {
        if (!isValido(voto)) {
            return false;
        }
        esami++;
        sommaVoti += voto;
        return true;
    }

    /** La media; 0 se non ci sono esami. */
    public double media() {
        if (esami == 0) {
            return 0;
        }
        return (double) sommaVoti / esami;
    }

    // corpo: visibile solo dentro Studente
    private boolean isValido(int voto) {
        return voto >= 18 && voto <= 30;
    }
}
