package me.clementino.solution.acompanhamentos;

public class Morango extends PadraoDeProjeto {

    private final double preco;

    public Morango() {
        preco = 4.99;
    }

    public String getDescricao() {
        return " com morango";
    }

    public double getPreco() {
        return preco;
    }
}
