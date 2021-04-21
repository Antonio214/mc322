public class AppRestaUm {
    public static void executaJogo(String caminho) {
        
        // CSV Reader
        CSVReader csv = new CSVReader();
        csv.setDataSource(caminho);
        String commands[] = csv.requestCommands();
        
        // Instances
        StateManager stateManager = new StateManager();
        LogicController logicController = new LogicController(stateManager);

        // Main logic
        for (int i = 0; i < commands.length; i++) {
            logicController.validateCommand(commands[i]);
            int Move[] = logicController.generateMove();
            LogicController.executeMove(Move);
            StateManager.printState();
        }
    }
}