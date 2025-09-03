package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;

public class MainEquipe {
    public static void main(String[] args) {
        Equipe grupo;
        String nome;
        String[] integrantes;
        int quantidade;

        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome da equipe");
                quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de integrantes ?"));
                integrantes = new String[quantidade];
                for (int i = 0; i < integrantes.length; i++) {
                    integrantes[i] = JOptionPane.showInputDialog(String.format("Integrantes %d", i + 1 ));

                }
                grupo = new Equipe(nome, integrantes);
                grupo.listaEquipe();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }while (JOptionPane.showConfirmDialog(null,"Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null,"fim do Programa. Até breve !","Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
