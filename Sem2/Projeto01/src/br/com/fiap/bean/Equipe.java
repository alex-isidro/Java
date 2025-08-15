package br.com.fiap.bean;

import javax.swing.*;
import java.awt.*;

public class Equipe {
    //atributso
    private String nome;
    private String[] integrantes;

    //contrutores
    public Equipe() {
    }

    public Equipe(String nome, String[] integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }

    //getter setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String[] integrantes) {
        this.integrantes = integrantes;
    }

    // metodos da callase particular
    public void listaEquipe(){
        String exibe = String.format("nome da Equipe : %s \n",nome);
        int cont = 1;
        for (String i : integrantes) {
            exibe += String.format("Integrante %d: %s \n",cont,i);
            cont++;
        }
        JOptionPane.showMessageDialog(null,  exibe,"Listagem de Equipe", JOptionPane.INFORMATION_MESSAGE);
    }
}
