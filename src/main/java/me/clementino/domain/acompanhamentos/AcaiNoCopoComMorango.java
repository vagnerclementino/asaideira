package me.clementino.domain.acompanhamentos;

import me.clementino.domain.base.Acai;
import me.clementino.domain.base.Tamanho;
import me.clementino.domain.tipos.AcaiNaTigela;
import me.clementino.domain.tipos.AcaiNoCopo;

public class AcaiNoCopoComMorango extends Acai {

    public AcaiNoCopoComMorango(Tamanho tamanho) {
        super.setTamanho(tamanho);
        super.setDescricao(new AcaiNoCopo(tamanho).getDescricao() + " com morango");
    }

    @Override
    public double cost() {
        return new AcaiNoCopo(super.getTamanho()).cost() + .59;
    }
}
