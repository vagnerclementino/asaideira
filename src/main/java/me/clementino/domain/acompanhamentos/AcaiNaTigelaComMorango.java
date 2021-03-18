package me.clementino.domain.acompanhamentos;

import me.clementino.domain.base.Acai;
import me.clementino.domain.base.Tamanho;
import me.clementino.domain.tipos.AcaiNaTigela;

public class AcaiNaTigelaComMorango extends Acai {

    private final AcaiNaTigela acaiNaTigela;

    public AcaiNaTigelaComMorango(Tamanho tamanho) {
        this.acaiNaTigela = new AcaiNaTigela(tamanho);
        super.setTamanho(tamanho);
        super.setDescricao(this.acaiNaTigela.getDescricao() + " com morango");
    }

    @Override
    public double cost() {
        return acaiNaTigela.cost() + .99;
    }
}
