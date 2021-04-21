public class StateManager {

    //Colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private String[] results;

    public StateManager(int lenght) {
        this.results = new String[lenght];
        // Iniciar a primeira posição
        System.out.print(" Tabuleiro inicial:");
        this.results[0] = "  PPP  \n  PPP  \nPPPPPPP\nPPP-PPP\nPPPPPPP\n  PPP  \n  PPP  \n";
    }

    public void generateNewState(int round) {
        if (round != 0) {
            this.results[round] = this.results[round - 1];
        }

    }

    public void turnPiece(int round, int position) {
        this.results[round][position] = "P";
    }

    public void turnSpace() {

    }

    public String[] getState() {
        return this.results;
    }

    public void printState(int index) {

        int line = 7;

        System.out.print("\n ");
        for (int i = 0; i < 7; i++) {
            System.out.print(ANSI_RED + line + " " + ANSI_RESET);
            line--;
            for (int j = 0; j < 8; j++) {
                System.out.print(results[index].charAt(i * 8 + j) + " ");
            }
        }
        System.out.print(ANSI_GREEN + "  a b c d e f g\n" + ANSI_RESET);

    }
}
