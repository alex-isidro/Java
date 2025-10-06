package br.com.fiap.controller;

import br.com.fiap.model.dao.CarroDAO;
import br.com.fiap.model.dao.ClienteDAO;
import br.com.fiap.model.dao.ConnectionFactory;
import br.com.fiap.model.dto.Cliente;

import java.sql.Connection;

public class ClienteController {
    public String inserir(String nome, String placa){
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        Cliente cliente = new Cliente();

        cliente.setNomeCliente(nome);
        cliente.setPlaca(placa);

        ClienteDAO clienteDAO = new ClienteDAO(con);
        resultado = clienteDAO.inserir(cliente);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String alterar(int idCliente, String nome, String placa){
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        Cliente cliente = new Cliente();

        cliente.setIdClidente(idCliente);
        cliente.setNomeCliente(nome);
        cliente.setPlaca(placa);

        ClienteDAO clienteDAO = new ClienteDAO(con);
        resultado = clienteDAO.inserir(cliente);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String delete(int id){
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();

        Cliente cliente = new Cliente();
        cliente.setIdClidente(id);
        CarroDAO carroDAO = new CarroDAO(con);
        resultado = carroDAO.excluir(cliente);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String listar(int id){
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        Cliente cliente = new Cliente();

        cliente.setIdClidente(id);
        CarroDAO carroDAO = new CarroDAO(con);
        resultado = carroDAO.listarUm(cliente);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }
}
