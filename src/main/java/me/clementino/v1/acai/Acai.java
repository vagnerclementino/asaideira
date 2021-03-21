package me.clementino.v1.acai;

public abstract class Acai {

    protected String descricao = "Açai do tipo desconhecido";
    protected Tamanho tamanho = Tamanho.PEQUENO;

    public String getDescricao() {
        return descricao;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return descricao +
            " do tamanho " +
            tamanho.getDescricao() +
            " custa R$" + String.format("%.2f", this.getPreco());
    }

    public abstract double getPreco();
}
