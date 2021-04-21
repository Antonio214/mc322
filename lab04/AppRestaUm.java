public class AppRestaUm {
    public static void executaJogo(String caminho) {
        
        // CSV Reader
        CSVReader csv = new CSVReader();
        csv.setDataSource(caminho);
        String commands[] = csv.requestCommands();
        
        // Instances
        LogicController logicController = new LogicController();
        // StateManager stateManager = new StateManager();

        // Main logic
        for (int i = 0; i < commands.length; i++) {
            logicController.validateCommand(commands[i]);
            int Move[] = logicController.generateMove();
            LogicController.executeMove(Move);
            StateManager.printState();
        }
    }
}