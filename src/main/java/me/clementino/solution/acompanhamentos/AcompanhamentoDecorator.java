package me.clementino.solution.acompanhamentos;

import me.clementino.v1.base.Acai;
import me.clementino.v1.base.Tamanho;

public abstract class AcompanhamentoDecorator extends Acai {
    public Acai acai;

    public abstract String getDescricao();

    public Tamanho getTamanho() {
        return acai.getTamanho();
    }
}
