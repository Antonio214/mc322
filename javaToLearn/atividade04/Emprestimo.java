/**
 * Emprestimo
 */
public class Emprestimo {
    double parcelaInicial;
    int numParcelas;
    int numParcelaAtual;
    double juros;
    double parcelaAtual;
    boolean acabou;

    Emprestimo(double parcelaInicial, int numParcelas, double juros) {
        this.parcelaInicial = parcelaInicial;
        this.juros = juros;
        this.numParcelas = numParcelas;
        this.numParcelaAtual = 1;
        this.parcelaAtual = parcelaInicial;
        this.acabou = false;
    }

    void proximaParcela() {
        if (this.numParcelaAtual < this.numParcelas) {
            this.parcelaAtual += (this.parcelaAtual * this.juros);
            this.numParcelaAtual++;
        } else {
            this.acabou = true;
        }
    }

    double getValorParcela() {
        return this.parcelaAtual;
    }

    double calcularParcelaDeNumero(int numParcela) {
        double parcelaCalculada = this.parcelaInicial;

        for (int i = 1; i < numParcela; i++) {
            parcelaCalculada += (parcelaCalculada * this.juros);
        }

        return parcelaCalculada;
    }

    boolean estaAberto() {
        return !this.acabou;
    }

}