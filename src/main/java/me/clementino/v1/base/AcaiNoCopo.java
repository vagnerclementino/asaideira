package me.clementino.v1.base;

public class AcaiNoCopo extends Acai {

    public AcaiNoCopo(Tamanho tamanho) {
        this.tamanho = tamanho;
        this.descricao = "Acaí no copo";
    }

    @Override
    public double getPreco() {
        switch (tamanho) {
            case GRANDE:
                return 9.99;
            case MEDIO:
                return 5.99;
            case PEQUENO:
                return 2.99;
            default:
                return .0;
        }
    }
}
