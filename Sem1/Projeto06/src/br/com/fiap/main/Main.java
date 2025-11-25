package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

public class Main {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        folha.salarioBruto= 10000;
        folha.descontoINSS= 15;
        folha.numeroDeDedentes= 4;
        folha.valorPlanoDeSaude=150;

        System.out.printf("Salario Bruto: R$ %.2f \nN de Dependentes: %d \nINSS: %.1f \nPlano de Saúde: R$ %.2f \n Salário Liquido: R$ %.2f", folha.salarioBruto, folha.numeroDeDedentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
    }
}
