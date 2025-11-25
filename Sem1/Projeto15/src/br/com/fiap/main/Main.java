package br.com.fiap.main;

import br.com.fiap.bean.ContaPoupanca;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String auxliar, escolha ="sim";
        int numConta,opcao;
        float saldo, valor;
        while (escolha.equalsIgnoreCase("sim")){
            try {
                auxliar= JOptionPane.showInputDialog("Digite Numeor da Conta popançã");
                numConta= Integer.parseInt(auxliar);

                auxliar= JOptionPane.showInputDialog("Digite valor do saldo");
                saldo= Float.parseFloat(auxliar);

                ContaPoupanca cp = new ContaPoupanca();
                cp.setNumConta(numConta);
                cp.setSaldo(saldo);
                auxliar= JOptionPane.showInputDialog("Escolha a Operação \n(1)saque \n(2)deposito");
                opcao = Integer.parseInt(auxliar);
                switch (opcao){
                    case 1:
                        auxliar= JOptionPane.showInputDialog("Digite o valor a ser sacado");
                        valor=Float.parseFloat(auxliar);
                        JOptionPane.showMessageDialog(null, String.format("Dados da Conta \nNuero da conta: %d \nsaldo Atual: R$ %.2f", cp.getNumConta(), cp.secar(valor)));
                        break;
                    case 2:
                        auxliar= JOptionPane.showInputDialog("Digite o valor a ser depositar");
                        valor=Float.parseFloat(auxliar);
                        JOptionPane.showMessageDialog(null, String.format("Dados da Conta \nNuero da conta: %d \nsaldo Atual: R$ %.2f", cp.getNumConta(), cp.depoitar(valor)));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção invalida");
                }




            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            escolha = JOptionPane.showInputDialog("Deseja continuar?");
        }
        JOptionPane.showMessageDialog(null, "fim do programa");
    }
}
