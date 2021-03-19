package me.clementino.v1;

import me.clementino.v1.acompanhamentos.LeiteEmPo;
import me.clementino.v1.base.Acai;
import me.clementino.v1.base.Tamanho;

public class AcaiNaBarcaComMorangoELeiteEmPo extends Acai {

    private final AcaiNaBarcaComMorango acaiNaBarcaComMorango;
    private final LeiteEmPo leiteEmPo;

    public AcaiNaBarcaComMorangoELeiteEmPo(Tamanho tamanho) {
        acaiNaBarcaComMorango = new AcaiNaBarcaComMorango(tamanho);
        leiteEmPo = new LeiteEmPo();
        this.tamanho = tamanho;
        this.descricao = this.acaiNaBarcaComMorango.getDescricao() + " e com leite em pó";
    }

    @Override
    public double getPreco() {
        return acaiNaBarcaComMorango.getPreco() + leiteEmPo.getPreco();
    }
}
