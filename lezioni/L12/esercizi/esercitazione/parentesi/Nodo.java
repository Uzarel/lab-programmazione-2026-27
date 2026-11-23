/** Un nodo di lista collegata: un dato e il riferimento al prossimo.
    Classe di servizio: visibile solo nel package (lezione 9). */
class Nodo<T> {

    T dato;
    Nodo<T> prossimo;

    Nodo(T dato) {
        this.dato = dato;
        prossimo = null;
    }
}
