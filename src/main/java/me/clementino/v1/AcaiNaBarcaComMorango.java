package me.clementino.v1;

import me.clementino.v1.acompanhamentos.Morango;
import me.clementino.v1.base.Acai;
import me.clementino.v1.base.Tamanho;
import me.clementino.v1.base.AcaiNaBarca;

public class AcaiNaBarcaComMorango extends Acai {

    private final AcaiNaBarca acaiNaBarca;
    private final Morango morango;

    public AcaiNaBarcaComMorango(Tamanho tamanho) {
        acaiNaBarca = new AcaiNaBarca(tamanho);
        morango = new Morango();
        this.tamanho = tamanho;
        this.descricao = this.acaiNaBarca.getDescricao() + " com morango";
    }

    @Override
    public double getPreco() {
        return acaiNaBarca.getPreco() + morango.getPreco();
    }
}
