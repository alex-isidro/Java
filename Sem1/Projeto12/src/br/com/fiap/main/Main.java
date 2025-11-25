package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Geometria geo = new Geometria();
        String auxiliar, escolha="sim";
        float lado, altura;
        double raio;
        int opcao;
        while (escolha.equalsIgnoreCase("sim")){
            try {
                auxiliar = JOptionPane.showInputDialog("qual calculo voce gostaria de saber? \n1 - quadrado \n2 - triangulo \n3 - circulo");
                opcao = Integer.parseInt(auxiliar);

                switch (opcao){
                    case 1:
                        auxiliar= JOptionPane.showInputDialog("infotme o lado : ");
                        lado = (Float.parseFloat(auxiliar));
                        geo.calcularArea(lado);
                        break;
                    case 2:
                        auxiliar=JOptionPane.showInputDialog("informe o lado e altura \nInforme o primeiro lado: ");
                        lado = (Float.parseFloat(auxiliar));
                        auxiliar=JOptionPane.showInputDialog("informe a altura: ");
                        altura = (Float.parseFloat(auxiliar));
                        geo.calcularArea(lado,altura);
                        break;
                    case 3 :
                        auxiliar=JOptionPane.showInputDialog("informe a raio: ");
                        raio = Double.parseDouble(auxiliar);
                        geo.calcularArea(raio);
                        break;
                    default:throw new Exception("escolha incorreta");
                }
                escolha= JOptionPane.showInputDialog("deseja continuar? ");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa. Volte sempre");

    }
}
