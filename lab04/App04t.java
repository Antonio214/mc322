public class App04t {
    public static void main(String[] args) {
        StateManager state = new StateManager(5);
        LogicController lgc = new LogicController(state);

        int[] moves;
        moves = lgc.generateMove("d6:d4");

        for (int i = 0; i < 3; i++) {
            System.out.println(moves[i]);
        }
    }
}
