package br.com.fiap.praticando;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Pokemon {
    public static void main(String[] args) {
        HashMap<String,String> pokemon = new HashMap<>();
        do {
            String nome, tipo;

            try {
                do {
                    nome =JOptionPane.showInputDialog("digite nome do Pokemon ou digite \"FIM\" para encerrar\n");
                    if (nome != null && !nome.isEmpty()) {
                        nome = nome.toLowerCase();
                        nome = nome.substring(0, 1).toUpperCase() + nome.substring(1);
                    }

                    if (!nome.equalsIgnoreCase("FIM")){
                        tipo = JOptionPane.showInputDialog(null,"Digite o tipo deste Pokemon infomado anteriormente").toLowerCase();

                        if (pokemon.containsKey(nome)){
                            JOptionPane.showMessageDialog(null, "estado ja cadastrado!");
                        }else {
                            pokemon.put(nome, tipo);
                        }
                    }
                }while (!nome.equalsIgnoreCase("FIM"));

                String procurar = JOptionPane.showInputDialog("Digite o tipo do Pokemon: ").toLowerCase();
                String lista = "Tipo escolhido: %s \nPokémons encontrados:\n".formatted(procurar);

                for (String tipos : pokemon.keySet()) {
                    if (pokemon.get(tipos).equals(procurar)) {
                        lista += "- %s \n".formatted(tipos);
                    }
                }
                JOptionPane.showMessageDialog(null, lista);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);


    }
}
