public class StateManager {
    private String[] results;

    public StateManager(int lenght) {
        this.results = new String[lenght];
        // Iniciar a primeira posição
        this.results[0] = "00PPP00\n00PPP00\nPPPPPPP\nPPP-PPP\nPPPPPPP\n00PPP00\n00PPP00\n";
    }

     public void generateNewState(int round){
        this.results[results.length-1] = this.results[results.length-2];
    }

    public void turnPiece(){

    }

    public void turnSpace(){
        
    }

    public String[] getState(){
        return this.results;
    }

    public static void printState() {
        System.out.println("#tonimDev é minha religião\n");
    }
}
