package br.com.fiap.model.dto;

public class Cliente {
    private int idClidente;
    private String nomeCliente, placa;

    public int getIdClidente() {
        return idClidente;
    }

    public void setIdClidente(int idClidente) {
        this.idClidente = idClidente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
