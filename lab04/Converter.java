public class Converter {

    /*
     * Recebe uma string no formato f4 Retorna a posição na string Base Ex: f4 -> 29
     */
    public static int parseStringPos(String stringPos) {
        char letter = stringPos.charAt(0);
        char num = stringPos.charAt(1);

        int line = turnNumToLine(num);
        int col = turnLetterToCol(letter);

        int pos = line * 8 + col;
        return pos;
    }

    static private int turnNumToLine(char num) {
        final int offset = 7;

        int value = Character.getNumericValue(num);
        int line = (value - offset) * -1;

        return line;
    }

    static private int turnLetterToCol(char letter) {
        final int offset = 97;

        int value = letter;
        int col = value - offset;

        return col;
    }
}
