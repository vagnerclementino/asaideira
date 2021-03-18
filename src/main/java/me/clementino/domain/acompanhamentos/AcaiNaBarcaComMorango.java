package me.clementino.domain.acompanhamentos;

import me.clementino.domain.base.Acai;
import me.clementino.domain.base.Tamanho;
import me.clementino.domain.tipos.AcaiNaBarca;

public class AcaiNaBarcaComMorango extends Acai {

    private final AcaiNaBarca acaiNaBarca;

    public AcaiNaBarcaComMorango(Tamanho tamanho) {
        acaiNaBarca = new AcaiNaBarca(tamanho);
        super.setTamanho(tamanho);
        super.setDescricao(this.acaiNaBarca.getDescricao() + " com morango");
    }

    @Override
    public double cost() {
        return acaiNaBarca.cost() + 4.99;
    }
}
