package br.com.fiap.main;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteClienteCRUD {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        Cliente cliente = new Cliente();
        ClienteDAO clienteDAO = new ClienteDAO(con);

        //cliente 1
        cliente.setIdCliente(1);
        cliente.setNomeCliente("alex");
        cliente.setPlaca("JKK1900");
        System.out.println(clienteDAO.inserir(cliente));

        //cliente 2
        cliente.setIdCliente(2);
        cliente.setNomeCliente("alex");
        cliente.setPlaca("JKK1900");
        System.out.println(clienteDAO.inserir(cliente));

        //cliente 3
        cliente.setIdCliente(3);
        cliente.setNomeCliente("alex");
        cliente.setPlaca("JKK1900");
        System.out.println(clienteDAO.inserir(cliente));

        //cliente 4
        cliente.setIdCliente(4);
        cliente.setNomeCliente("alex");
        cliente.setPlaca("JKK1900");
        System.out.println(clienteDAO.inserir(cliente));

        // Alterando os dados de um cliente
        cliente.setIdCliente (3);
        cliente.setNomeCliente("Josenelson");
        cliente.setPlaca ("JKK1903");
        System.out.println(clienteDAO.alterar (cliente));
        // Excluindo um cliente
        cliente.setIdCliente (2);
        System.out.println(clienteDAO.excluir(cliente));
        // Listando todos os clientes
        ArrayList<Cliente> resultado =clienteDAO.listarTodos();
        if (resultado != null) {
            for (Cliente cliente1 : resultado) {
                System.out.println("Id: "+ cliente1.getIdCliente());
                   System.out.println("Nome: " + cliente1.getNomeCliente());
                System.out.println("Placa: "+ cliente1.getPlaca());
                   System.out.println();
            }
        }
        ConnectionFactory.fecharConexao (con);
    }
}
