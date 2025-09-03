package br.com.fiap.bean;

import br.com.fiap.exception.SaldoInsuficienteExceptio;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double quantia) throws SaldoInsuficienteExceptio {
        if (quantia > saldo){
            throw new SaldoInsuficienteExceptio("Saldo insuficiente para realizar o saque");

        }
    }
}