package br.com.fiap.praticando.main;

import br.com.fiap.bean.Pessoa;
import br.com.fiap.praticando.card.DragonBallSuper;

import javax.swing.*;
import java.io.IOException;

public class UsaDBSuper {
    public static void main(String[] args) {
        String aux, nome, email, path, codigoP;
        int opcao,ki,tecnicas,velocidade,trasformacao;
        Pessoa dra;
        do {
            try {
                aux = JOptionPane.showInputDialog("Escolha:\n1.Cadastrar\n2.Consultar");
                opcao = Integer.parseInt(aux);
                path = JOptionPane.showInputDialog("Digite caminho da pasta");
                DragonBallSuper dra = new DragonBallSuper();

                switch (opcao) {
                    case 1:

                        codigoP = JOptionPane.showInputDialog("Digite o codigo");
                        nome = JOptionPane.showInputDialog("Digite o nome");
                        email = JOptionPane.showInputDialog("Digite o e-mail");
                        dra.setCodigo(codigoP);
                        dra.setNome(nome);
                        dra.setEmail(email);
                        JOptionPane.showMessageDialog(null,dra.gravar(path));
                        break;
                    case 2:
                        codigoP = JOptionPane.showInputDialog("Digite o codigo");
                        dra.setCodigo(codigoP);
                        dra = dra.ler(path);
                        if (dra == null) {
                            JOptionPane.showMessageDialog(null,
                                    "Caminho e/ou codigo informado inexistente");
                        } else {
                            JOptionPane.showMessageDialog(null,"Exibindo dados:"
                                    + "\nCaminho: " + path
                                    + "\nArquivo: " + path + "/" + dra.getCodigo() + ".txt"
                                    + "\nCodigo: " + dra.getCodigo()
                                    + "\nNome: " + dra.getNome()
                                    + "\nE-mail: " + dra.getEmail());
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
