package br.com.fiap.dao;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection AbrirConexao(){
        Connection con = null;

        //    public Connection recuperarConexao(){
//        String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
//        String usuario = "";
//        String senha = "";
//
//        try {
//            Connection con = DriverManager.getConnection(url, usuario, senha);
//            System.out.println("Conexão feita com sucesso!");
//            return con;
//        } catch (SQLException e) {
//            throw new RuntimeException();
//        }
//
//    }

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
            final String USER = "RM";
            final String PASS = "senha";
            con = DriverManager.getConnection(url, USER, PASS);

            System.out.println("certo");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: A classe de conexão não foi encontrada!\n" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro de SQL!\n" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return con;
    }

    public static void fecharConexao(Connection con){
        try {
            con.close();
            System.out.println("Conexão fechada");
        } catch (SQLException e) {
            System.out.println("Erro no SQL\n" +e.getMessage());
        }
    }


}
