package br.com.fiap;

import javax.swing.*;

public class area2 {
    public static void main(String[] args) {
        try {
            int raio=Integer.parseInt(JOptionPane.showInputDialog("Digite valor de raio: "));
            float area=(float)(Math.PI * Math.pow(raio, 2));

            JOptionPane.showMessageDialog(null,String.format("Valor de raio: %.2f%n", area));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato de número incorreto!);");
        }
    }
}
