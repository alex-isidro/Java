package aula1;

import javax.swing.*;
import java.util.Random;


public class Mian {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(10);
        int sorte = -1;
        String sal;

        while (sorte != numeroAleatorio){

            sal= JOptionPane.showInputDialog("valor");
            sorte= Integer.parseInt(sal);
            if(numeroAleatorio >= sorte){
                JOptionPane.showMessageDialog(null," o numero Aleatorio é Maior que "+sorte);
            }else {
                JOptionPane.showMessageDialog(null," o numero Aleatorio é Menor que "+sorte);
            }
        }
        JOptionPane.showMessageDialog(null,"boa!!!!!!!");
    }
}
