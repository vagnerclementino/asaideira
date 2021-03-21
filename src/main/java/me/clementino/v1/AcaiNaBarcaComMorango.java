package me.clementino.v1;

import me.clementino.v1.acompanhamentos.Morango;
import me.clementino.v1.acai.Acai;
import me.clementino.v1.acai.Tamanho;
import me.clementino.v1.acai.tipos.AcaiNaBarca;

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
