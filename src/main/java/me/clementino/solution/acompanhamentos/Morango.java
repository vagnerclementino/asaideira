package me.clementino.solution.acompanhamentos;

import me.clementino.v1.base.Acai;

public class Morango extends AcompanhamentoDecorator {

    private final double preco;

    public Morango(Acai acai) {
        this.acai = acai;
        preco = 4.99;
    }


    @Override
    public String getDescricao() {
        return acai.getDescricao() + " com morango";
    }

    @Override
    public double getPreco() {
        return acai.getPreco() + preco;
    }
}
