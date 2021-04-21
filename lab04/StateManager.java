public class StateManager {
    private String[] results;

    public StateManager(int lenght) {
        this.results = new String[lenght];
        // Iniciar a primeira posição
        System.out.println("Tabuleiro inicial:");
        this.results[0] = "00PPP00\n00PPP00\nPPPPPPP\nPPP-PPP\nPPPPPPP\n00PPP00\n00PPP00\n";
    }

    public void generateNewState(int round) {
        if (round != 0) {
            this.results[round] = this.results[round - 1];
        }

    }

    public void turnPiece() {

    }

    public void turnSpace() {

    }

    public String[] getState() {
        return this.results;
    }

    public void printState(int index) {
        System.out.println(this.results[index]);
        System.out.println("a b c d e f g");
    }
}
