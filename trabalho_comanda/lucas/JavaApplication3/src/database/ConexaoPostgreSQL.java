/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class ConexaoPostgreSQL {
    private String host;
    private String port;
    private String user;
    private String password;
    private String database;
    
    public ConexaoPostgreSQL(){
        this.host = "localhost";
        this.port = "5432";
        this.user = "postgres";
        this.password =  "admin";
        this.database = "banco";        
    }
    
    public Connection getConexao(){
        String url = "jdbc:postgresql://"+host+":"+port+"/"+database;
        try {
            System.out.println("Coisa boa...conectei....");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("Deu xabum na conexao....");
            Logger.getLogger(ConexaoPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
    }
    
}
