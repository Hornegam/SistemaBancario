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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Cliente;
import model.bean.InfoCliente;
import model.bean.Transacao;

/**
 * CRUD = CREATE READ UPDATE DELETE
 *
 * @author Junior
 */
public class ClienteDAO {
    
    private Connection con = null;
    
    public ClienteDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create(Cliente cliente) {
        String sql = "INSERT INTO Cliente (Apelido,CPF) VALUES (?,?)";
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1,cliente.getApelido());
            stmt.setInt(2,cliente.getCPF());
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
