package me.clementino.v1.acai.tipos;

import me.clementino.v1.acai.Acai;
import me.clementino.v1.acai.Tamanho;

public class AcaiNaBarca extends Acai {

    public AcaiNaBarca(Tamanho tamanho) {
        this.tamanho = tamanho;
        this.descricao = "Acaí na barca";
    }

    @Override
    public double getPreco() {
        switch (tamanho) {
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
