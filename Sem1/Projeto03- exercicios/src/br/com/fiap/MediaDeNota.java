package br.com.fiap;

import java.util.Scanner;

public class MediaDeNota {
    public static void main(String[] args) {
        float NO1=0, NO2=0, NO3=0, NO4=0, resultado=0;
        Scanner scan;

        try {
            scan = new Scanner(System.in); //instenciação do objeto scan

            System.out.print("Digite 1º nota: ");
            NO1= scan.nextInt();

            System.out.print("Digite 2º nota: ");
            NO2 = scan.nextInt();

            System.out.print("Digite 3º nota: ");
            NO3= scan.nextInt();

            System.out.print("Digite 4º nota: ");
            NO4 = scan.nextInt();

            resultado = (NO1+NO2+NO3+NO4)/4;
            System.out.print("Nota 1: "+ NO1+"\nNota 2: "+NO2+"\nNota 3: "+NO3+"\nNota 4 :"+NO4+"\nMedia: "+resultado);

        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }

    }
}
