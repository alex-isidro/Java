package br.com.fiap.main;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;

public class TesteClienteCRUD {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();
        Cliente cliente = new Cliente();
        ClienteDAO carroDAO = new ClienteDAO(con);
        cliente.setIdCliente(1);
        cliente.setNomeCliente("alex");
        cliente.setPlaca("JKK1900");
        System.out.println(carroDAO.inserir(cliente));
        ConnectionFactory.fecharConexao(con);
    }
}
