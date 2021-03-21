package me.clementino.v1;

import me.clementino.v1.acompanhamentos.Morango;
import me.clementino.v1.acai.Acai;
import me.clementino.v1.acai.tipos.AcaiNoCopo;
import me.clementino.v1.acai.Tamanho;

public class AcaiNoCopoComMorango extends Acai {

    private final AcaiNoCopo acaiNoCopo;
    private final Morango morango;

    public AcaiNoCopoComMorango(Tamanho tamanho) {
        this.acaiNoCopo = new AcaiNoCopo(tamanho);
        this.morango = new Morango();
        this.tamanho = tamanho;
        this.descricao = this.acaiNoCopo.getDescricao() + " com morango";
    }

    @Override
    public double getPreco() {
        return acaiNoCopo.getPreco() + morango.getPreco();
    }
}
