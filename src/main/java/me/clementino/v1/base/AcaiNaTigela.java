package me.clementino.v1.base;

public class AcaiNaTigela extends Acai {

    public AcaiNaTigela(Tamanho tamanho) {
        this.tamanho = tamanho;
        this.descricao = "Acaí na tigela";
    }

    @Override
    public double getPreco() {
        switch (tamanho) {
            case GRANDE:
                return 12.99;
            case MEDIO:
                return 8.99;
            case PEQUENO:
                return 5.99;
            default:
                return .0;
        }
    }
}
