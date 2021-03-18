package me.clementino.domain.acompanhamentos;

import me.clementino.domain.base.Acai;
import me.clementino.domain.base.Tamanho;
import me.clementino.domain.tipos.AcaiNaBarca;
import me.clementino.domain.tipos.AcaiNoCopo;

public class AcaiNaBarcaComMorangoELeiteEmPo extends Acai {

    public AcaiNaBarcaComMorangoELeiteEmPo(Tamanho tamanho) {
        super.setTamanho(tamanho);
        super.setDescricao(new AcaiNaBarcaComMorango(tamanho).getDescricao() + " e com leite em pó");
    }

    @Override
    public double cost() {
        return new AcaiNaBarcaComMorango(super.getTamanho()).cost() + 1.99;
    }
}
