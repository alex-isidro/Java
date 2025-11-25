package br.com.fiap.main;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar,escolha = "sim";
        float lado, altura, area;
        int opcao;
        while (escolha.equalsIgnoreCase("sim")){
            try {
                auxiliar=JOptionPane.showInputDialog("Qual area deseja calcular? \n(1)quadrado \n(2)Retangulo \n(3)Triangulo");
                opcao=Integer.parseInt(auxiliar);
                switch (opcao){
                    case 1:
                        auxiliar= JOptionPane.showInputDialog("Digite valor de lado");
                        lado= Float.parseFloat(auxiliar);
                        Quadrado quad =new Quadrado(lado);
                        area=quad.calcularArea();
                        JOptionPane.showMessageDialog(null,String.format("Area do quadrado: %.2f", area));
                        break;
                    case 2:
                        auxiliar= JOptionPane.showInputDialog("Digite valor de lado");
                        lado= Float.parseFloat(auxiliar);
                        auxiliar= JOptionPane.showInputDialog("Digite valor de altura");
                        altura= Float.parseFloat(auxiliar);
                        Retangulo ret = new Retangulo(lado, altura);
                        area= ret.calcularArea();
                        JOptionPane.showMessageDialog(null,String.format("Area do quadrado: %.2f", area));
                        break;
                    case 3:
                        auxiliar= JOptionPane.showInputDialog("Digite valor de lado");
                        lado= Float.parseFloat(auxiliar);
                        auxiliar= JOptionPane.showInputDialog("Digite valor de altura");
                        altura= Float.parseFloat(auxiliar);
                        Triangulo tri = new Triangulo(lado,altura);
                        area = tri.calcularArea();
                        JOptionPane.showMessageDialog(null,String.format("Area do quadrado: %.2f", area));
                        break;
                    default:
                        throw new Exception("escolha incorreta");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        JOptionPane.showConfirmDialog(null,"fim de programa. Volte sempre!");
    }
}
