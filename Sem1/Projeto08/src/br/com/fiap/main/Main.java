package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        Scanner scanner = new Scanner(System.in);
        int escolha;
        try {
            System.out.println("Qual canal e volume você gostaria? \nCanal: ");
            tv.setCanal(scanner.nextInt());
            System.out.print("volume: ");
            tv.setCanal(scanner.nextInt());


            System.out.println("Faça sua escolha \n(1) Definir novo canal \n(2) Definir novo volume \n(3) Aumentar volume \n(4) Diminuir volume");
            escolha = scanner.nextInt();
            if (escolha == 1){
                System.out.println("Digite um novo canal");
                tv.setCanal(scanner.nextInt());
            } else if (escolha==2) {
                System.out.println("Digite um novo volume");
                tv.setVolume(scanner.nextInt());
            }else if (escolha==3){
                tv.aumentarVolume();
                System.out.println("Aumentando volume");

            }else {
                tv.diminuirVolume();
                System.out.println("diminuindo volume");
            }

            System.out.printf("Canal atual: %d \nVolume atual: %d", tv.getCanal(),tv.getVolume());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
