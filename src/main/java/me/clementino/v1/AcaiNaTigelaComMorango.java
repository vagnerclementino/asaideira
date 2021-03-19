package me.clementino.v1;

import me.clementino.v1.acompanhamentos.Morango;
import me.clementino.v1.base.Acai;
import me.clementino.v1.base.AcaiNaTigela;
import me.clementino.v1.base.Tamanho;

public class AcaiNaTigelaComMorango extends Acai {

    private final AcaiNaTigela acaiNaTigela;
    private final Morango morango;

    public AcaiNaTigelaComMorango(Tamanho tamanho) {
        acaiNaTigela = new AcaiNaTigela(tamanho);
        morango = new Morango();
        this.tamanho = tamanho;
        this.descricao = acaiNaTigela.getDescricao() + " com morango";
    }

    @Override
    public double getPreco() {
        return acaiNaTigela.getPreco() + morango.getPreco();
    }
}
