package me.clementino.domain.acompanhamentos;

import me.clementino.domain.base.Acai;
import me.clementino.domain.base.Tamanho;

public class AcaiNaBarcaComMorangoELeiteEmPo extends Acai {

    private final AcaiNaBarcaComMorango acaiNaBarcaComMorango;

    public AcaiNaBarcaComMorangoELeiteEmPo(Tamanho tamanho) {
        acaiNaBarcaComMorango = new AcaiNaBarcaComMorango(tamanho);
        super.setTamanho(tamanho);
        super.setDescricao(this.acaiNaBarcaComMorango.getDescricao() + " e com leite em pó");
    }

    @Override
    public double cost() {
        return acaiNaBarcaComMorango.cost() + 1.99;
    }
}
