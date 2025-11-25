package br.com.fiap;

import javax.swing.*;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        try {
            System.out.println("Qual valor de raio: ");
            int raio= scan.nextInt();
            float PI = (float) Math.PI;
            float area =  PI * (float) Math.pow(raio, 2);

            System.out.printf("A área do círculo é: %.2f%n", area);

        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");

        }
    }
}
