package br.com.fiap.main;

import javax.swing.*;

public class CompararString {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Crie sua senha");
        String validacao = JOptionPane.showInputDialog("Digite sua senha");

        // tem que ser exatamente iguais
        if (validacao.equals(senha)){
            JOptionPane.showMessageDialog(null, "acesso permitido");
        }else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }

        // compara as senhas, mas ignora se aletra estiver em maiusculo ou minusculo

//        if (validacao.equalsIgnoreCase(senha)){
//            JOptionPane.showMessageDialog(null, "Ola");
//        }else {
//            JOptionPane.showMessageDialog(null, "Senha invalida");
//        }
    }
}
