package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Astrogildo");
        pessoa1.setAnoNascimento(1998);
        int idadePessoal1 = pessoa1.calcularIdade(2025);

        Pessoa pessoa2 = new Pessoa("Berisvaldo", 2000);
        Pessoa pessoa3 = new Pessoa("jonas", 2003);

        System.out.printf("Pessoa 1 \nNome %s \nIdade: %d anos", pessoa1.getNome(),idadePessoal1);

        System.out.printf("\nPessoa 2 \nNome %s \nIdade: %d anos", pessoa2.getNome(),pessoa2.calcularIdade(2025));

        System.out.printf("\nPessoa 2 \nNome %s \nIdade: %d anos", pessoa3.getNome(),pessoa3.calcularIdade(2025));


    }
}
