package me.clementino.solution.acompanhamentos;

import me.clementino.v1.base.Acai;

public class LeiteEmPo extends AcompanhamentoDecorator {

    private final double preco;

    public LeiteEmPo(Acai acai) {
        this.acai = acai;
        preco = 1.99;
    }

    @Override
    public String getDescricao() {
        return acai.getDescricao();
    }

    @Override
    public double getPreco() {
        return acai.getPreco() + preco;
    }
}
