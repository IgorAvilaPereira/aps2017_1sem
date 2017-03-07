/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import negocio.PessoaFisica;

/**
 *
 * @author iapereira
 */
public class PessoaFisicaDAO {
    
    public boolean inserir(PessoaFisica pessoaFisica) throws SQLException{
        Conexao conexao =  new Conexao();
        Connection connection = conexao.getConnection();
        // fazer o inserir
        String sql = "INSERT INTO "
                + "pessoafisica (nome, cpf) VALUES (?, ?);";
        PreparedStatement sqlP = connection.prepareStatement(sql);
        sqlP.setString(1, pessoaFisica.getNome());
        sqlP.setString(2, pessoaFisica.getCpf());        
        int resultado = sqlP.executeUpdate();
        sqlP.close();
        connection.close();
        return resultado == 1;
    }
    
}
