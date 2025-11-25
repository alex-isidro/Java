package br.com.fiap.view;

import javax.swing.*;

public class ParkingView {
    public static void main(String[] args) {
        String menu = """
           === MENU PRINCIPAL ===

                1 - Gerenciar Carros
                2 - Gerenciar Cliente
                0 - Sair
           """;
        int opcao;
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (opcao) {
                    case 1 -> CarroView.main(null);
                    case 2 -> ClienteView.main(null);
                    case 0 -> JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                opcao = -1;
            }
        }while (opcao != 0 && opcao != JOptionPane.CLOSED_OPTION);
    }
}
