public class App04 {
    public static void main(String[] args) {
        StateManager state = new StateManager();
        LogicController lgc = new LogicController(state);

        System.out.println(lgc.validateCommand("f4:d4"));
        System.out.println(lgc.validateCommand("c4:e4"));
        System.out.println(lgc.validateCommand("c2:f2"));
    }
}
