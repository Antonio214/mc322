public class App04 {
    public static void main(String[] args) {

        StateManager state = new StateManager(2);
        state.generateNewState();
        String[] results = state.getState();
        System.out.println(results[0]);
        System.out.println(results[1]);

    }

}
