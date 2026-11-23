public class ProvaParentesi {

    public static void main(String[] args) {
        String[] prove = { "(a + b) * [c - {d}]", "((a + b)",
                           "(a + b))", "[(a + b])", "" };
        for (String s : prove) {
            System.out.println("\"" + s + "\" -> "
                    + Parentesi.isBilanciata(s));
        }
    }
}
