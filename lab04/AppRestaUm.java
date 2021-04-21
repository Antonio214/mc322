public class AppRestaUm {
    public static void executaJogo(String caminho) {
        CSVReader csv = new CSVReader();
        LogicController logicController = new LogicController();
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