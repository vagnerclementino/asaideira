package me.clementino.solution.acompanhamentos;

public class LeiteEmPo extends PadraoDeProjeto {

    private final double preco;

    public LeiteEmPo() {
        preco = 1.99;
    }

    @Override
    public String getDescricao() {
        return " com leite em pó";
    }

    public double getPreco() {
        return preco;
    }
}
