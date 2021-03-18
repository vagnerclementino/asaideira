package me.clementino.domain.acompanhamentos;

import me.clementino.domain.base.Acai;
import me.clementino.domain.base.Tamanho;
import me.clementino.domain.tipos.AcaiNaBarca;

public class AcaiNaBarcaComMorango extends Acai {

    public AcaiNaBarcaComMorango(Tamanho tamanho) {
        super.setTamanho(tamanho);
        super.setDescricao(new AcaiNaBarca(tamanho).getDescricao() + " com morango");
    }

    @Override
    public double cost() {
        return new AcaiNaBarca(super.getTamanho()).cost() + 4.99;
    }
}
