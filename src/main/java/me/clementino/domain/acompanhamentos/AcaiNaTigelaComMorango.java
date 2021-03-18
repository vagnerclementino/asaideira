package me.clementino.domain.acompanhamentos;

import me.clementino.domain.base.Acai;
import me.clementino.domain.base.Tamanho;
import me.clementino.domain.tipos.AcaiNaBarca;
import me.clementino.domain.tipos.AcaiNaTigela;

public class AcaiNaTigelaComMorango extends Acai {

    public AcaiNaTigelaComMorango(Tamanho tamanho) {
        super.setTamanho(tamanho);
        super.setDescricao(new AcaiNaTigela(tamanho).getDescricao() + " com morango");
    }

    @Override
    public double cost() {
        return new AcaiNaTigela(super.getTamanho()).cost() + .99;
    }
}
