package br.com.fiap.dto;

public class Carro {
    private String placa, cor, descricao;

    public Carro() {
    }

    public Carro(String placa, String cor, String descricao) {
        this.placa = placa;
        this.cor = cor;
        this.descricao = descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
