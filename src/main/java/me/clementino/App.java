package me.clementino;

import me.clementino.domain.acompanhamentos.AcaiNaBarcaComMorango;
import me.clementino.domain.acompanhamentos.AcaiNaBarcaComMorangoELeiteEmPo;
import me.clementino.domain.acompanhamentos.AcaiNaTigelaComMorango;
import me.clementino.domain.acompanhamentos.AcaiNoCopoComMorango;
import me.clementino.domain.base.Acai;
import me.clementino.domain.tipos.AcaiNaBarca;
import me.clementino.domain.tipos.AcaiNaTigela;
import me.clementino.domain.tipos.AcaiNoCopo;

import static me.clementino.domain.base.Tamanho.*;

/**
 * Classe principal da Asaideira!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Acai acai1 = new AcaiNaTigela(PEQUENO);
        System.out.println(acai1);

        Acai acai2 = new AcaiNoCopo(MEDIO);
        System.out.println(acai2);

        Acai acai3 = new AcaiNaBarca(GRANDE);
        System.out.println(acai3);

        Acai acai4 = new AcaiNaBarcaComMorango(PEQUENO);
        System.out.println(acai4);

        Acai acai5 = new AcaiNoCopoComMorango(MEDIO);
        System.out.println(acai5);

        Acai acai6 = new AcaiNaTigelaComMorango(GRANDE);
        System.out.println(acai6);

        Acai acai7 = new AcaiNaBarcaComMorangoELeiteEmPo(GRANDE);
        System.out.println(acai7);
    }
}
