package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.exception.SaldoInsuficienteExceptio;

public class UsaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);

        try {
            conta.sacar(1500);

        } catch (SaldoInsuficienteExceptio e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
