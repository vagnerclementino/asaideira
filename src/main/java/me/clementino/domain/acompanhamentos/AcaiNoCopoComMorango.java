package me.clementino.domain.acompanhamentos;

import me.clementino.domain.base.Acai;
import me.clementino.domain.base.Tamanho;
import me.clementino.domain.tipos.AcaiNoCopo;

public class AcaiNoCopoComMorango extends Acai {

    private final AcaiNoCopo acaiNoCopo;

    public AcaiNoCopoComMorango(Tamanho tamanho) {
        this.acaiNoCopo = new AcaiNoCopo(tamanho);
        super.setTamanho(tamanho);
        super.setDescricao(this.acaiNoCopo.getDescricao() + " com morango");
    }

    @Override
    public double cost() {
        return acaiNoCopo.cost() + .59;
    }
}
