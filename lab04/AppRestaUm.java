public class AppRestaUm {
    public static void executaJogo(String caminho) {
        CSVReader csv = new CSVReader();
        StateManager state = new StateManager();
        Converter converter = new Converter();
        LogicController logicController = new LogicController(state);
        // StateManager stateManager = new StateManager();
        csv.setDataSource(caminho);
        String commands[] = csv.requestCommands();
        for (int i = 0; i < commands.length; i++) {
            logicController.validateCommand(commands[i]);
            int Move[] = logicController.generateMove();
            LogicController.executeMove(Move);
            StateManager.printState();
        }
    }
}