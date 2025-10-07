package br.com.fiap.model.dao;

import br.com.fiap.model.dto.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO implements IDAO {
    private Connection con;
    private Cliente cliente;

    public ClienteDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public String inserir(Object object) {
        cliente = (Cliente) object;
        String sql = "insert into ddd_cliente(nome_cliente,placa) values(?,?)";
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String alterar(Object object) {
        cliente = (Cliente) object;
        String sql = "update ddd_cliente set NOME_CLIENTE = ?, placa = ? where id_cliente = ?";
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getPlaca());
            ps.setInt(3, cliente.getIdClidente());
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String excluir(Object object) {
        cliente = (Cliente) object;
        String sql = "delete from ddd_cliente where id_cliente = ?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setInt(1, cliente.getIdClidente());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    public String listarUm(Object object) {
        cliente = (Cliente) object;
        String sql = "select * from ddd_cliente where id_cliente = ?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setInt(1, cliente.getIdClidente());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return String.format("ID: %d\nNome: %s\nPlaca: %s\n",
                   rs.getInt("id_cliente"),
                   rs.getString("NOME_CLIENTE"),
                   rs.getString("placa"));
            } else {
                return "Registro não encontrado!";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
