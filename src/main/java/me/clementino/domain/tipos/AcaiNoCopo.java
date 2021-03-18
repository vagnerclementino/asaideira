package me.clementino.domain.tipos;

import me.clementino.domain.base.Acai;
import me.clementino.domain.base.Tamanho;

public class AcaiNoCopo extends Acai {
    public AcaiNoCopo(Tamanho tamanho) {
        super.setTamanho(tamanho);
        super.setDescricao("Acaí no copo");
    }

    @Override
    public double cost() {
        switch (super.getTamanho()) {
            case GRANDE:
                return 9.99;
            case MEDIO:
                return 5.99;
            case PEQUENO:
                return 2.99;
            default:
                return .0;
        }
    }
}
