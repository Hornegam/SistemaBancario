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
import model.bean.Transacao;
import model.bean.limite;

/**
 *
 * @author Junior
 */
public class TransacaoDAO {

    private Connection con = null;

    public TransacaoDAO() {
        con = ConnectionFactory.getConnection();
    }


    public boolean criar(Transacao tran) {
        String sql = "INSERT INTO Transacao(Saldo,ClienteID) VALUES (?,?)";
        String sql2 = "INSERT INTO limite(limite,IdCliente) VALUES (?,?)";
        PreparedStatement stmt = null;
        limite temp = new limite();
        try {
         
            //Colocar saldo
            stmt = con.prepareStatement(sql);
            stmt.setDouble(1,tran.getSaldo());
            stmt.setInt(2, tran.getIdTransacao());
           
            stmt.executeUpdate();
            
            //Calcular Limite
            temp.setSaldo(tran.getSaldo());
            temp.setClienteID(tran.getIdTransacao());
         stmt = con.prepareStatement(sql2);
            stmt.setDouble(1, temp.getLimite());
            stmt.setInt(2, temp.getClienteID());
         
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("ERRO " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);

        }

    }
    
    public boolean lerSaldo(Transacao tran){
    
    
    return false ;
    }

}
