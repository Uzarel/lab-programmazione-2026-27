public class InfoCarattere {
    public static void main(String[] args) {
        String s = "Aula T2, ore 9:30";
        int lettere = 0;
        int cifre = 0;
        int maiuscole = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                lettere++;
            }
            if (Character.isDigit(c)) {
                cifre++;
            }
            if (Character.isUpperCase(c)) {
                maiuscole++;
            }
        }
        System.out.println(lettere + " lettere, " + cifre
                + " cifre, " + maiuscole + " maiuscole");

        char m = Character.toUpperCase('a');       // 'A'
        char r = Character.toUpperCase('7');       // '7'
        System.out.println(m + " " + r);
    }
}
