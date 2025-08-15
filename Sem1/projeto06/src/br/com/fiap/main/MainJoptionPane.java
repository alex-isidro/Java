package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class MainJoptionPane {
    public static void main(String[] args) {

        FolhaDePagamento folha = new FolhaDePagamento();
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("salario Bruto: ");
            folha.salarioBruto = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Desconto INSS: ");
            folha.descontoINSS = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Numero De dependentes: ");
            folha.numeroDeDedentes = Integer.parseInt(auxiliar);

            auxiliar= JOptionPane.showInputDialog("valor do Plano De Saude: ");
            folha.valorPlanoDeSaude = Double.parseDouble(auxiliar);
            System.out.println();

            String mensagem = String.format("Salario Bruto: R$ %.2f \nN de Dependentes: %d \nINSS: %.1f \nPlano de Saúde: R$ %.2f \n Salário Liquido: R$ %.2f", folha.salarioBruto, folha.numeroDeDedentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());

            JOptionPane.showMessageDialog(null, mensagem);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
        }
    }
}

