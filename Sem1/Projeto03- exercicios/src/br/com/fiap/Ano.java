package br.com.fiap;

import java.util.Scanner;

public class Ano {
    public static void main(String[] args) {

        int resultado,DataDeNascimento, Ano;;
        Scanner scan;
        try {
            scan = new Scanner(System.in);

            System.out.print("Seu ano de nascimento: ");
            DataDeNascimento =scan.nextInt();

            System.out.print("Data do ano atual ");
            Ano =scan.nextInt();

            resultado = Ano-DataDeNascimento;

            System.out.print("Sua idade: "+ resultado);


        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }

    }
}
