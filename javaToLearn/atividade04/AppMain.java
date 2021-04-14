public class AppMain {
    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo(100, 3, 0.5);

        System.out.println("Parcela Inicial: " + emprestimo.getValorParcela());
        System.out.println("Juros: " + emprestimo.juros);

        for (int i = 0; i < 5; i++) {
            if (emprestimo.estaAberto()) {
                System.out.println("Parcela Atual: " + emprestimo.getValorParcela());
                emprestimo.proximaParcela();
            } else {
                System.out.println("Emprestimo Finalizado!");
            }
        }
    }
}
