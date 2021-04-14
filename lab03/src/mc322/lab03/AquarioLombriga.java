/**
 * AquarioLombriga
 */
public class AquarioLombriga {

    int tamAquario;
    int tamLombriga;
    boolean estaViradaDireita;
    int posCabeca;
    int posCalda;

    AquarioLombriga(int tamAquario, int tamLombriga, int posicao) {
        this.tamAquario = (tamAquario > tamLombriga) ? tamAquario : tamLombriga;
        this.tamLombriga = tamLombriga;
        this.estaViradaDireita = true;
        this.posCalda = (posicao + (this.tamLombriga - 1) <= tamAquario) ? posicao : 1;
        this.posCabeca = this.posCalda + tamLombriga - 1;
        return;
    }

    private boolean podeCrescer() {
        if (this.estaViradaDireita && this.posCalda > 1) {
            return true;
        } else if (!this.estaViradaDireita && this.posCalda < this.tamAquario) {
            return true;
        }
        return false;
    }

    public void crescer() {
        if (this.podeCrescer()) {
            tamLombriga++;
            if (this.estaViradaDireita) {
                posCalda--;
            } else {
                posCalda++;
            }
        }
    }

    public void virar() {
        this.estaViradaDireita = !this.estaViradaDireita;
        int aux = this.posCabeca;
        this.posCabeca = this.posCalda;
        this.posCalda = aux;
    }

    private boolean podeMover() {
        if (this.estaViradaDireita && this.posCabeca < this.tamAquario) {
            return true;
        } else if (!this.estaViradaDireita && this.posCabeca > 1) {
            return true;
        }

        return false;
    }

    public void mover() {
        if (this.podeMover()) {
            if (this.estaViradaDireita) {
                this.posCabeca++;
                this.posCalda++;
            } else {
                this.posCabeca--;
                this.posCalda--;
            }
        } else {
            this.virar();
        }
    }

    public String apresenta() {
        String rep = "";

        for (int posAtual = 1; posAtual <= tamAquario; posAtual++) {
            if (this.estaViradaDireita) {
                if (posAtual < this.posCalda || posAtual > this.posCabeca) {
                    rep += "#";
                } else if (posAtual >= this.posCalda && posAtual < this.posCabeca) {
                    rep += "@";
                } else {
                    rep += "O";
                }
            } else {
                if (posAtual < this.posCabeca || posAtual > this.posCalda) {
                    rep += "#";
                } else if (posAtual > this.posCabeca && posAtual <= this.posCalda) {
                    rep += "@";
                } else {
                    rep += "O";
                }
            }
        }

        return rep;
    }
}