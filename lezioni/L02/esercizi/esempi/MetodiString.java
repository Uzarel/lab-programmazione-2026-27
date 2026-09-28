/* Lezione 2 -- I metodi principali della classe String. */
public class MetodiString {

    public static void main(String[] args) {
        String s = " Diego Armando Maradona ";
        String t = s.trim();                           // toglie gli spazi ai bordi

        System.out.println("[" + s + "]");
        System.out.println("[" + t + "]");
        System.out.println("length()        = " + t.length());        // 22
        System.out.println("charAt(0)       = " + t.charAt(0));       // D
        System.out.println("charAt(ultimo)  = " + t.charAt(t.length() - 1));
        System.out.println("indexOf(\"Arm\")  = " + t.indexOf("Arm"));  // 6
        System.out.println("indexOf('a')    = " + t.indexOf('a'));     // 9
        System.out.println("indexOf(\"Pele\") = " + t.indexOf("Pele")); // -1: non c'e`
        System.out.println("substring(6,13) = " + t.substring(6, 13)); // Armando (13 escluso)
        System.out.println("substring(14)   = " + t.substring(14));    // fino alla fine
        System.out.println("toUpperCase()   = " + t.toUpperCase());
        System.out.println("toLowerCase()   = " + t.toLowerCase());
        System.out.println("replace('a','4')= " + t.replace('a', '4'));
        System.out.println("contains(\"go\")  = " + t.contains("go"));
        System.out.println("startsWith(\"Di\")= " + t.startsWith("Di"));
        System.out.println("endsWith(\"na\")  = " + t.endsWith("na"));

        // Confronti: MAI con ==
        String u = "diego";
        System.out.println("equals            = " + u.equals("Diego"));            // false
        System.out.println("equalsIgnoreCase  = " + u.equalsIgnoreCase("Diego"));  // true
        System.out.println("\"abc\".compareTo(\"abd\") = " + "abc".compareTo("abd")); // < 0
        System.out.println("\"b\".compareTo(\"a\")     = " + "b".compareTo("a"));     // > 0
        System.out.println("\"Zoe\".compareTo(\"anna\") = " + "Zoe".compareTo("anna")); // < 0: 'Z' < 'a'
    }
}
