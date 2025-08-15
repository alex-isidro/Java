package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FiltroSemStream {
    public static void main(String[] args) {
        ArrayList<String> herois = new ArrayList<>(
                Arrays.asList("Homen-Aranha","wolverine", "tocha Humana", "Homen de ferro")
        );

        ArrayList<String> heroisComH = new ArrayList<>();
        for (String heroi : herois){
            if (heroi.startsWith("H")){
                 heroisComH.add(heroi);
            }

        }
        JOptionPane.showConfirmDialog(null,"herois com h: \n"+ heroisComH);    }
}
