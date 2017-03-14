/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class TicketDAO {
    
    public boolean inserir(String extrato) throws SQLException{
        Connection connection = Singleton.getInstance().getConexao();
        PreparedStatement sqlInsert = connection.prepareStatement("INSERT INTO ticket(extrato) VALUES (?);");
        sqlInsert.setString(1, extrato);
        int resultado = sqlInsert.executeUpdate();
        
        return resultado == 1;
    }
    
}
