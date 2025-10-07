package br.com.fiap.view;

import br.com.fiap.controller.CarroController;
import javax.swing.*;

public class CarroView {
    public static void main(String[] args) {
        String placa, cor, descricao;
        int opcao;

        String[] escolha= {"Inserir", "Alterar", "Excluir", "Listar"};
        CarroController carroController = new CarroController();

        do {
            try {

                opcao = JOptionPane.showOptionDialog(null, "Escolha uma das opcões abaixo para manipular um Carro","Escolha", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null, escolha, escolha[0]);
                placa = JOptionPane.showInputDialog("Digite a placa do Carro");
                switch (opcao){
                    case 0:
                        cor = JOptionPane.showInputDialog("Digite a cor do carro");
                        descricao = JOptionPane.showInputDialog("Digite uma descrição para o carro");
                        System.out.println(carroController.inserirCarro(placa, cor,descricao));
                        break;
                    case 1:
                        cor = JOptionPane.showInputDialog("Digite a NOVA do corro");
                        descricao = JOptionPane.showInputDialog("Digite uma Noma descrição para o carro");
                        System.out.println(carroController.alterarCarro(placa, cor,descricao));
                        break;
                    case 2:
                        System.out.println(carroController.excluirCarro(placa));
                        break;
                    case 3:
                        System.out.println(carroController.listarCarro(placa));

                        break;
                    default:
                }
            } catch (Exception e) {
                System.out.printf("Erro" + e.getMessage());
            }
        }while (JOptionPane.showConfirmDialog(null, "Deseja continuar?","atenção", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0);
        JOptionPane.showMessageDialog(null,"Fim do Programa");

    }
}
