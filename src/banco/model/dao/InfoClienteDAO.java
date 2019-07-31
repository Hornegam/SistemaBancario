/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.InfoCliente;

/**
 *
 * @author Junior
 */
public class InfoClienteDAO {

    private Connection con = null;

    public InfoClienteDAO() {
        con = ConnectionFactory.getConnection();
    }
    ClienteDAO cli = new ClienteDAO();

    public boolean criar(InfoCliente infCli) {
        String sql = "INSERT INTO InfoCliente(CPF,Nome,Sobrenome,Endereco,Idade) values (?,?,?,?,?)";
        String sql2 = "INSERT INTO Cliente(Apelido,CPF) VALUES(?,?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, infCli.getCpf());
            stmt.setString(2, infCli.getNome());
            stmt.setString(3, infCli.getSobrenome());
            stmt.setString(4, infCli.getEndereco());
            stmt.setInt(5, infCli.getIdade());
//            stmt.setInt(6, infCli.getIdCliente());
            stmt.executeUpdate();
            
            stmt = con.prepareStatement(sql2);
            stmt.setString(1, infCli.getApelido());
            stmt.setInt(2, infCli.getCpf());
            
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {

            System.err.println("ERRO" + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);

        }

    }

}
