package me.clementino.domain.base;

public abstract class Acai {


    String descricao = "Açai do tipo desconhecido";
    Tamanho tamanho = Tamanho.PEQUENO;

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return this.getDescricao() +
            " do tamanho " +
            this.getTamanho().getDescricao() +
            " custa R$" + String.format("%.2f", this.cost());
    }

    public abstract double cost();
}
