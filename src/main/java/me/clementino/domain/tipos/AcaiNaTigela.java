package me.clementino.domain.tipos;

import me.clementino.domain.base.Acai;
import me.clementino.domain.base.Tamanho;

public class AcaiNaTigela extends Acai {

    public AcaiNaTigela(Tamanho tamanho) {
        super.setTamanho(tamanho);
        super.setDescricao("Acaí na tigela");
    }

    @Override
    public double cost() {
        switch (super.getTamanho()) {
            case GRANDE:
                return 12.99;
            case MEDIO:
                return 8.99;
            case PEQUENO:
                return 5.99;
            default:
                return .0;
        }
    }
}
