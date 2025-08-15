package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FolhaDePagamento folha= new FolhaDePagamento();

        System.out.print("salario Bruto: ");
        folha.salarioBruto= scanner.nextDouble();

        System.out.print("Desconto INSS: ");
        folha.descontoINSS = scanner.nextDouble();

        System.out.print("Numero De Dedentes: ");
        folha.numeroDeDedentes = scanner.nextInt();

        System.out.print("valor do Plano De Saude: ");
        folha.valorPlanoDeSaude = scanner.nextDouble();
        System.out.println();

        System.out.printf("Salario Bruto: R$ %.2f \nN de Dependentes: %d \nINSS: %.1f \nPlano de Saúde: R$ %.2f \n Salário Liquido: R$ %.2f", folha.salarioBruto, folha.numeroDeDedentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
    }
}
