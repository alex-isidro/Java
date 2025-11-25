package br.com.fiap;

import javax.swing.*;
import java.awt.*;

public class ano2 {
    public static void main(String[] args) {
        int ano_nascimento, ano_atual, resultado;
        String resposta;
        try {
            resposta= JOptionPane.showInputDialog("Digite ano de nascimento: ");
            ano_nascimento = Integer.parseInt(resposta);

            resposta= JOptionPane.showInputDialog("Digite ano atual: ");
            ano_atual= Integer.parseInt(resposta);

            resultado = ano_atual- ano_nascimento;
            JOptionPane.showMessageDialog(null,"\nIDade: "+resultado);
        } catch (HeadlessException e) {
            JOptionPane.showInputDialog(null,"Formato de número incorreto!);");
        }
    }
}
