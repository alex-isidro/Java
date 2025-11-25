package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroComStream {
    public static void main(String[] args) {
        ArrayList<String> herois = new ArrayList<>(
                Arrays.asList("Homen-Aranha","wolverine", "tocha Humana", "Homen de ferro")
        );

//        ArrayList<String> heroisComH = new ArrayList<>();
        List<String> heroisComH = herois.stream()
                .filter( heroi -> heroi.startsWith("H"))
                        .collect(Collectors.toList());

        JOptionPane.showConfirmDialog(null,"herois com h: \n"+ heroisComH);    }
}
