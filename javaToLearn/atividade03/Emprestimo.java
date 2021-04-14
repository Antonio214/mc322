/**
 * Emprestimo
 */
public class Emprestimo {

    static double calcularParcela(int numParcela, double valPrimParcela, double percJuros) {
        double valorParcela = valPrimParcela;

        for (int i = 1; i < numParcela; i++) {
            valorParcela = valorParcela + (valorParcela * percJuros);
        }

        return valorParcela;
    }

    public static void main(String[] args) {

        double valorPrimeiraParcela = 200;
        int numeroParcelas = 5;
        double percentualJuros = 0.01;

        for (int atual = 1; atual <= numeroParcelas; atual++) {
            double valorAtual = calcularParcela(atual, valorPrimeiraParcela, percentualJuros);
            System.out.println("Valor da Parcela " + atual + " é de " + valorAtual);
        }
    }
}