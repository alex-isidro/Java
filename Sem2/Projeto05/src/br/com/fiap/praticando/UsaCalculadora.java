package br.com.fiap.praticando;

import javax.swing.JOptionPane;

public class UsaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        boolean continuar = true;

        while (continuar) {
            try {
                // Entrada dos números
                float n1 = Float.parseFloat(
                   JOptionPane.showInputDialog("Digite o primeiro número:")
                );
                calc.setNumero1(n1);

                float n2 = Float.parseFloat(
                   JOptionPane.showInputDialog("Digite o segundo número:")
                );
                calc.setNumero2(n2);

                String menu = """
                        Escolha a operação:
                        1 - Adição
                        2 - Subtração
                        3 - Multiplicação
                        4 - Divisão
                        """;

                int opcao = Integer.parseInt(
                   JOptionPane.showInputDialog(menu)
                );

                float resultado = 0;
                switch (opcao) {
                    case 1 -> resultado = calc.adicao();
                    case 2 -> resultado = calc.subtracao();
                    case 3 -> resultado = calc.multiplicacao();
                    case 4 -> resultado = calc.divisao();
                    default -> {
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        continue;
                    }
                }

                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: digite apenas números válidos.");
                continue;
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                continue;
            }

            int resp = JOptionPane.showConfirmDialog(null,
               "Deseja continuar?", "Confirmação",
               JOptionPane.YES_NO_OPTION);

            if (resp != JOptionPane.YES_OPTION) {
                continuar = false;
            }
        }

        JOptionPane.showMessageDialog(null, "Obrigado por usar a calculadora! Até logo.");
    }
}

