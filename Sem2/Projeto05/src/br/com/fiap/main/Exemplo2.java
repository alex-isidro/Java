package br.com.fiap.main;

import javax.swing.*;
import java.awt.*;

public class Exemplo2 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro entre 1 á 50"));
            if (num < 1 || num >50){
                throw new Exception("Número informado fora da caixa");
            }

            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro qualquer "));

            JOptionPane.showMessageDialog(null,"Soma: " + (num + num2));
            JOptionPane.showMessageDialog(null,"subtração: " + (num - num2));
            JOptionPane.showMessageDialog(null,"Multiplicação: " + (num * num2));
            JOptionPane.showMessageDialog(null,"Divisão: " + (num / num2));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro de formato numerico :" + e.getMessage());
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "ERRO de leitura via caixa de dialogo: " + e.getMessage());
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "ERRO de Divisão por zero" + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"erro" + e.getMessage());
        }finally {
            System.out.println("Fim de Programa");
        }
    }
}
