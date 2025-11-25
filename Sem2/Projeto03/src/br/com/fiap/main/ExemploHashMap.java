package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String,String>mapa = new HashMap<>();
        do {
            try {
                String sigla, estado;
                // Cadastro de sigla e estado
                do {
                    sigla =JOptionPane.showInputDialog("digite uma Unidade Federal (UF) de um estado ou digite \"FIM\" para encerrar").toUpperCase();

                    if (!sigla.equals("FIM")){
                        estado = JOptionPane.showInputDialog(null,"Digite o nome completo deste estado infomado anteriormente");

                        if (mapa.containsKey(sigla)){
                            JOptionPane.showMessageDialog(null, "estado ja cadastrado!");
                        }else {
                            mapa.put(sigla,estado);
                        }
                    }
                }while (!sigla.equals("FIM"));

                //buscando pelo nomne de um estado a aprtir de sua sigla
                String escolha = JOptionPane.showInputDialog("Digite uma UF a Sua escolha").toUpperCase();
                if (mapa.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "O nome completo deste estado é: " + mapa.get(escolha), "Nome do estado", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Estado não cadastrado!","atenção",JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
