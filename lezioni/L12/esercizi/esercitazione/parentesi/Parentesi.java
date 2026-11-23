/** Modulo: controllo del bilanciamento delle parentesi con una pila. */
public class Parentesi {

    /** Vero se le parentesi di s sono bilanciate. */
    public static boolean isBilanciata(String s) {
        Pila<Character> pila = new PilaLista<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()
                        || !corrispondono(pila.pop(), c)) {
                    return false;
                }
            }
        }
        return pila.isEmpty();   // nessuna aperta
    }

    private static boolean corrispondono(char a, char c) {
        return (a == '(' && c == ')')
                || (a == '[' && c == ']')
                || (a == '{' && c == '}');
    }
}
