package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;

public class TesteCreate {
    public static void main(String[] args) {
        String placa, cor, descricao;

        Connection con = ConnectionFactory.AbrirConexao();
        Carro carro = new Carro();

        carro.setPlaca("JKK1900");
        carro.setCor("vermelho");
        carro.setDescricao("Nissan KIcks");

        CarroDAO carroDAO = new CarroDAO(con);
        System.out.println(carroDAO.inserir(carro));

        try {
            placa = JOptionPane.showInputDialog("placa do carro");
            cor = JOptionPane.showInputDialog("cor do carro");
            descricao = JOptionPane.showInputDialog("descrição do carro");

            Carro carroInput = new Carro(placa,cor,descricao);
            String resultadoInput = carroDAO.inserir(carroInput);

        } catch (HeadlessException e) {
            throw new RuntimeException(e);
        }

        ConnectionFactory.fecharConexao(con);


    }
}
