/**
 * Animacao
 */
public class Animacao {
    String seqPassos;
    int passoAtual;
    AquarioLombriga estado;

    Animacao(String animacao) {
        int tamAquario = Integer.parseInt(animacao.substring(0, 2));
        int tamLombriga = Integer.parseInt(animacao.substring(2, 4));
        int posicao = Integer.parseInt(animacao.substring(4, 6));
        this.seqPassos = animacao.substring(6);
        this.estado = new AquarioLombriga(tamAquario, tamLombriga, posicao);
        this.passoAtual = 0;
    }

    public String apresenta() {
        return this.estado.apresenta();
    }

    private void realizarPasso(char instrucao) {
        switch (instrucao) {
        case 'C':
            this.estado.crescer();
            break;
        case 'M':
            this.estado.mover();
            break;
        case 'V':
            this.estado.virar();
            break;
        default:
            break;
        }
    }

    public void passo() {
        if (this.passoAtual < seqPassos.length()) {
            this.realizarPasso(seqPassos.charAt(passoAtual));
            passoAtual++;
        }
    }
}
