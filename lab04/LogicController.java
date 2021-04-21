// Classe LogicController:
// 	validateCommand(): valida o movimento
// 	generateMove(): faz o calculo do movimento, retorna um array de 3 posições onde a primeira é o P, a segunda e a terceira são os -
// 	executeMove(): atualiza o estado usando as funções do StateManager

public class LogicController {
    private StateManager state;

    LogicController(StateManager state) {
        this.state = state;
    }

    public boolean validateCommand(String command) {
        char firLet = command.charAt(0);
        char firNum = command.charAt(1);
        char secLet = command.charAt(3);
        char secNum = command.charAt(4);

        if (firLet == secLet) {
            if (firNum == (secNum + 2) || firNum == (secNum - 2)) {
                return true;
            }
        } else if (firNum == secNum) {
            if (firLet == (secLet + 2) || firLet == (secLet - 2)) {
                return true;
            }
        }

        return false;
    }

    public int[] generateMove() {
        int[] coordenadas = { 0, 1 };
        return coordenadas;
    }

    public static void executeMove(int[] Num, int round) {
        System.out.println("O melhor ataque é a defesa\n");
        return;
    }
}
