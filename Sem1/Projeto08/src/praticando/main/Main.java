package praticando.main;

import praticando.bean.Arcondicionado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Arcondicionado ar = new Arcondicionado();
        int escolha;

        try {
            ar.setTemperatura(20);

            System.out.println("Modos:Ventilar, Aquecer e Esfriar \nQual modo você vai querer?");
            ar.setModo(scan.next());

            System.out.printf("temperatura atual : %d \ngostaria de mudar? \n(1) Definir nova temperatura \n(2) Aumentar temperatura \n(3) Diminuir temperatura \n(4)não \n", ar.getTemperatura());
            escolha =scan.nextInt();

            if (escolha == 1){
                System.out.println("Digite um nova temperatura");
                ar.setTemperatura(scan.nextInt());
            } else if (escolha==2) {
                ar.aumentarTemperatura();
                System.out.println("Aumentando temperatura");
            }else if (escolha==3){
                ar.diminuirTemperatura();
                System.out.println("diminuindo volume");
            }

            System.out.printf("Modo atual: %s \nVolume atual: %d", ar.getModo(),ar.getTemperatura());

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }


    }
}
