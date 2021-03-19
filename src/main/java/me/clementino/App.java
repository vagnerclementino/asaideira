package me.clementino;

//import me.clementino.solution.acompanhamentos.LeiteEmPo;
//import me.clementino.solution.acompanhamentos.Morango;
import me.clementino.v1.AcaiNaBarcaComMorango;
import me.clementino.v1.AcaiNaBarcaComMorangoELeiteEmPo;
import me.clementino.v1.AcaiNaTigelaComMorango;
import me.clementino.v1.AcaiNoCopoComMorango;
import me.clementino.v1.base.Acai;
import me.clementino.v1.base.AcaiNaBarca;
import me.clementino.v1.base.AcaiNaTigela;
import me.clementino.v1.base.AcaiNoCopo;

import static me.clementino.v1.base.Tamanho.*;

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

        //A partir dessa linha vem a solução do problema utilizando padrão de projeto
        System.out.println("****INICIO DO TRABALHO PRATICO****");

//        Acai acai8 = new Morango(new AcaiNaTigela(GRANDE));
//        System.out.println(acai8);
//
//        Acai acai9 = new LeiteEmPo(new Morango(new AcaiNaBarca(GRANDE)));
//        System.out.println(acai9);

        System.out.println("****FIM DO TRABALHO PRATICO****");
    }
}
