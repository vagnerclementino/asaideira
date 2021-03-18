package me.clementino.domain.base;


import java.util.Arrays;

public enum Tamanho {

    PEQUENO(1, "Pequeno"),
    MEDIO(2, "Medio"),
    GRANDE(3, "Grande");

    private final int codigo;
    private final String descricao;

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    Tamanho(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static Tamanho toEnum(Integer codigo) {
        return Arrays
            .stream(Tamanho.values())
            .filter(t -> codigo.equals(t.getCodigo()))
            .findAny()
            .orElseThrow(() -> new IllegalArgumentException("O código informado " + codigo + "não é valido"));
    }
}
