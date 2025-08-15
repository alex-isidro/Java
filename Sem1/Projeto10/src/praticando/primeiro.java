package praticando;

import javax.swing.*;

public class primeiro {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o sue nome ?");
        JOptionPane.showMessageDialog(null, String.format("Nome: %s  \nQuantidade: %s \nminusculo: %s", nome, nome.length(),nome.toLowerCase()));
        String letra = JOptionPane.showInputDialog("DIgite uma letra do nome que deseja subtituir");
        String subLetra = JOptionPane.showInputDialog("por qual letra gostaria de subtituir");
        //A (%s) gostaria de subtituir por qal letra?
        JOptionPane.showMessageDialog(null, nome.replace(letra,subLetra));
        JOptionPane.showMessageDialog(null, nome.length());

    }
}
