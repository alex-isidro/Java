package br.com.fiap.bean;

import javax.swing.*;
import java.util.stream.Stream;

public class SuperHeroi {
    //atributos

    private String nome;
    private String idScreta;
    private String[] poderes;
    private String[] fraqueza;

    //contrutores
    public SuperHeroi(){}

    public SuperHeroi(String nome, String idScreta, String[] poderes, String[] fraqueza) {
        this.nome = nome;
        this.idScreta = idScreta;
        this.poderes = poderes;
        this.fraqueza = fraqueza;
    }

    //setter e getter


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdScreta() {
        return idScreta;
    }

    public void setIdScreta(String idScreta) {
        this.idScreta = idScreta;
    }

    public String[] getPoderes() {
        return poderes;
    }

    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }

    public String[] getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String[] fraqueza) {
        this.fraqueza = fraqueza;
    }

    // metodo
    public void listarHeroi(){
        String exibir = String.format("""
           nome: %s
           Identidade Secreta: %s
           Poderes: %s
           Fraqueza: %s
           """, nome, idScreta, poderes, fraqueza);
        JOptionPane.showMessageDialog(null, "Info", exibir, JOptionPane.INFORMATION_MESSAGE);
    }

}
