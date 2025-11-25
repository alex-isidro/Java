package br.com.fiap;

import javax.swing.*;

public class MediaNota2 {
    public static void main(String[] args) {
        int no1, no2,no3,no4, resultado;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite 1ºnota: ");
            no1 = Integer.parseInt(auxiliar);

            auxiliar= JOptionPane.showInputDialog("Digite 2ºnota: ");
            no2 = Integer.parseInt(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite 3ºnota: ");
            no3 = Integer.parseInt(auxiliar);

            auxiliar= JOptionPane.showInputDialog("Digite 4ºnota: ");
            no4 = Integer.parseInt(auxiliar);

            resultado= (no1+no2+no3+no4)/4;
            JOptionPane.showMessageDialog(null,"Nota 1: "+ no1 +"\nNota 2: "+no2+"\nNota 3: "+no3+"\nNota 4: "+no4+"\nMedia: "+resultado);

        } catch (Exception e) {
            JOptionPane.showInputDialog(null,"Formato de número incorreto!);");
        }
    }
}
