package br.com.fiap.praticando.main;

import br.com.fiap.praticando.card.DragonBallSuper;

import javax.swing.*;
import java.io.IOException;

public class UsaDBSuper {
    public static void main(String[] args) {
        String aux, nome, path;
        int opcao, ki, tecnicas, velocidade, trasformacao;
        DragonBallSuper dra;

        do {
            try {
                aux = JOptionPane.showInputDialog("Escolha a operação:\n1. Cadastrar\n2. Consultar");
                opcao = Integer.parseInt(aux);

                path = JOptionPane.showInputDialog("Digite o nome da pasta");
                dra = new DragonBallSuper();

                switch (opcao) {
                    case 1:
                        nome = JOptionPane.showInputDialog("Digite o nome do personagem");
                        ki = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ki"));
                        tecnicas = Integer.parseInt(JOptionPane.showInputDialog("Digite as Técnicas"));
                        velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Velocidade"));
                        trasformacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de Transformações"));

                        dra.setNome(nome);
                        dra.setKi(ki);
                        dra.setTecnicas(tecnicas);
                        dra.setVelocidade(velocidade);
                        dra.setTrasformacao(trasformacao);

                        JOptionPane.showMessageDialog(null, dra.gravar(path));
                        break;

                    case 2:
                        nome = JOptionPane.showInputDialog("Digite o nome do personagem");
                        dra.setNome(nome);
                        dra = dra.ler(path);

                        if (dra == null) {
                            JOptionPane.showMessageDialog(null,
                               "Caminho e/ou personagem informado inexistente");
                        } else {
                            JOptionPane.showMessageDialog(null,"Exibindo dados:"
                               + "\nCaminho: " + path
                               + "\nArquivo: " + path + "/" + dra.getNome() + ".txt"
                               + "\nNome: " + dra.getNome()
                               + "\nKi: " + dra.getKi()
                               + "\nTécnicas: " + dra.getTecnicas()
                               + "\nVelocidade: " + dra.getVelocidade()
                               + "\nTransformações: " + dra.getTrasformacao());
                        }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Escolha incorreta");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro de Conversão!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Acessar Arquivo!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de programa");
    }
}
