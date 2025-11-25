package br.com.fiap.main;
import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;

public class MainSuperHeroi {
    public static void main(String[] args) {

        SuperHeroi heroi;
        String nome, idsecdreto;
        int qtdPoder, qtdFraqueza;
        String[] poderes, fraqueza;


        do {
            try {
                nome =  JOptionPane.showInputDialog("Informe o nome: ");
                idsecdreto = JOptionPane.showInputDialog("Identidade secreta: ");
                qtdPoder = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de poderes ?"));
                qtdFraqueza = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de fraqueza ?"));
                poderes = new String[qtdPoder];
                fraqueza = new String[qtdFraqueza];

                for (int i = 0; i < poderes.length; i++) {
                    poderes[i] = JOptionPane.showInputDialog(String.format("Integrantes %d", i + 1 ));
                }

                for (int i = 0; i < poderes.length; i++) {
                    fraqueza[i] = JOptionPane.showInputDialog(String.format("Integrantes %d", i + 1 ));
                }

                heroi = new SuperHeroi(nome,idsecdreto,poderes, fraqueza);
                heroi.listarHeroi();
                heroi.listarHeroi();


            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }while (JOptionPane.showConfirmDialog(null,"Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null,"fim do Programa. Até breve !","Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
