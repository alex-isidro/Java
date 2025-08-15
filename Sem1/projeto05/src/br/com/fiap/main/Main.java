package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.FolhaDePagamentos;
import br.com.fiap.bean.Televisor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        Televisor tv = new Televisor();
//        tv.volume= 9;
//        tv.canal= 5;
//        tv.aumentarVolume();
//        tv.aumentarVolume();
//        tv.aumentarVolume();
//        tv.diminuirVolume();
//        tv.trocarCanal(9);
//        System.out.printf("informações da TV\nVolume atual: %d \nCanal atual: %d", tv.volume,tv.canal);

//        ArCondicionado ar= new ArCondicionado();
//        ar.temperatura=25;
//        ar.modo= "ventilar";
//        ar.diminuirTemperatura();
//        ar.trocarModo("resfriar");
//        ar.diminuirTemperatura();
//        String mensagem = String.format("\ninformações do Ar Condicionado\nTemperatura: %dºC \nModo: %s",ar.temperatura,ar.modo);
//        System.out.println(mensagem);
//        JOptionPane.showConfirmDialog(null, mensagem);

            FolhaDePagamentos folha= new FolhaDePagamentos();
            folha.salarioBruto = 50000;
            folha.numeroDeDepentes= 7;
            folha.descontoINSS= folha.salarioBruto *0.10;
            folha.valorPlanoDeSaude= 1000;
        System.out.println("Salario Liquido "+folha.CalcularSalarioLiquido());

    }
}
