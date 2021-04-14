public class AppLab03 {
    public static void main(String[] args) {
        String seq = "080403MCMVM";
        int offSet = 6; // qtd de char que não são passos
        int qtdPassos = seq.length() - offSet;

        Animacao animacao = new Animacao(seq);
        System.out.println(animacao.apresenta());

        for (int i = 0; i < qtdPassos; i++) {
            animacao.passo();
            System.out.println(animacao.apresenta());
        }
    }
}
