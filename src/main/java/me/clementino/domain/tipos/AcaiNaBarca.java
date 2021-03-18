package me.clementino.domain.tipos;

import me.clementino.domain.base.Acai;
import me.clementino.domain.base.Tamanho;

public class AcaiNaBarca extends Acai {

    public AcaiNaBarca(Tamanho tamanho) {
        super.setTamanho(tamanho);
        super.setDescricao("Acaí na barca");
    }

    @Override
    public double cost() {
        switch (super.getTamanho()) {
            case GRANDE:
                return 29.99;
            case MEDIO:
                return 21.99;
            case PEQUENO:
                return 15.99;
            default:
                return .0;
        }
    }
}
