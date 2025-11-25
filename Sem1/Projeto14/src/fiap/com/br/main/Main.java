package fiap.com.br.main;

import fiap.com.br.bean.ContaBancaria;
import fiap.com.br.bean.ContaPoupanca;

import java.io.FilterOutputStream;


public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        ContaPoupanca pou = new ContaPoupanca();
        int valor = 1000;
        conta.setSaldo(10000);
        conta.sacar(10000);
        conta.depositar(250);
//        pou.setSaldo(conta.getSaldo());
        pou.novoSaldo(2);

        System.out.println(conta.getSaldo());
        System.out.println(pou.getSaldo());
    }

}
