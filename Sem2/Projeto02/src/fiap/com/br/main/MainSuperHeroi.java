package fiap.com.br.main;

import fiap.com.br.bean.SuperHeroi;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MainSuperHeroi {

    public static void main(String[] args) {
        SuperHeroi super1;
        String nome, idSecreta, auxiliar;

        do {
            try {
                nome = JOptionPane.showInputDialog("Nome do Herói");
                idSecreta = JOptionPane.showInputDialog("Identidade Secreta");
                ArrayList<String> poder = new ArrayList<>();
                ArrayList<String> fraqueza = new ArrayList<>();

                String parar =  "continua";

                while (parar.equalsIgnoreCase("continua")){
                    auxiliar = JOptionPane.showInputDialog("Digite um poder para continuar ou digite \"fim\" para encerrar");

                    if (auxiliar.equalsIgnoreCase("fim")){
                        parar = "fim";
                    }else {
                        poder.add(auxiliar);
                    }
                }
                parar =  "continua";
                while (parar.equalsIgnoreCase("continua")){
                    auxiliar = JOptionPane.showInputDialog("Digite um fraqueza para continuar ou digite \"fim\" para encerrar");

                    if (auxiliar.equalsIgnoreCase("fim")){
                        parar = "fim";
                    }else {
                        fraqueza.add(auxiliar);
                    }
                }

                super1 = new SuperHeroi(nome, idSecreta, poder, fraqueza);
                super1.listarHeroi();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
