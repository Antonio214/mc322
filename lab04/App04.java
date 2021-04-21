public class App04 {
    public static void main(String[] args) {

        StateManager state = new StateManager(2);
        state.generateNewState(1);
        //String[] results = state.getState();
        state.printState(0);
        state.printState(1);

    }

}
