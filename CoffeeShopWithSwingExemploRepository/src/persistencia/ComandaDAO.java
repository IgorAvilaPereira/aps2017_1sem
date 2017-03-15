/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Comanda;

/**
 *
 * @author root
 */
public class ComandaDAO {

    public void insert(String extrato) throws SQLException {
        Connection connectionSingleton = Conexao.getInstance();
        //System.out.println("HashCode:"+connectionSingleton);
        String sql = "INSERT INTO comanda(descricao) VALUES (?);";
        PreparedStatement sqlPrepare = connectionSingleton.prepareStatement(sql);
        sqlPrepare.setString(1, extrato);
        sqlPrepare.executeUpdate();
    }
    
    public ArrayList<Comanda> select(String condicao) throws SQLException{
        ArrayList<Comanda> vetComanda = new ArrayList();
        Connection connectionSingleton = Conexao.getInstance();
        String sql = "SELECT * FROM comanda WHERE "+condicao;
        PreparedStatement sqlPrepare = connectionSingleton.prepareStatement(sql);
        ResultSet rs = sqlPrepare.executeQuery();
               while (rs.next()){ // tem mais linha no bd, se tem me retorna????
            Comanda comanda = new Comanda();
            // me retorna o valor da coluna da linha que estou iterando.
            //rs.getString("descricao");
            comanda.setExtrato(rs.getString("descricao"));
           comanda.setId(rs.getInt("id"));

            
            vetComanda.add(comanda);
        }
        return vetComanda;
    }
}
