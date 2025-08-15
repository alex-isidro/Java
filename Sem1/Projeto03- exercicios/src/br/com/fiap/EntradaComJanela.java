package br.com.fiap;

import javax.swing.*;

public class EntradaComJanela {
    public static void main(String[] args) {
        int num1, num2, resultado;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite um númro inteiro: ");
            num1 = Integer.parseInt(auxiliar);

            auxiliar= JOptionPane.showInputDialog("Digite outro número inteiro: ");
            num2 = Integer.parseInt(auxiliar);

            resultado= num1 + num2;
            JOptionPane.showMessageDialog(null,"valor 1: "+ num1 +"\nValor 2: "+num2+"\nResultado: "+resultado);

        } catch (Exception e) {
            JOptionPane.showInputDialog(null,"Formato de número incorreto!);");
        }
    }
}
