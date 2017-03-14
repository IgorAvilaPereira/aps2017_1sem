/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comanda;

import apresentacao.Tela;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import apresentacao.*;
import static java.util.Collections.singleton;
import persistencia.conexao;

/**
 *
 * @author aluno
 */
public class Pedido {

    public static void inserir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Tela tela = new Tela();
    public boolean inserir(String registro) throws SQLException{
      
        
  
     conexao Conexao = new conexao();
         String reg = tela.getRegistro();
        
        int resultado;
        // fazer o inserir
        try (Connection connection = conexao.getConnection()) {
            // fazer o inserir
            String sql = "INSERT INTO "
                    + "Descricao (registro) VALUES (?);";
            try (PreparedStatement sqlP = connection.prepareStatement(sql)) {
                //sqlP.setString(registro);
                
                resultado = sqlP.executeUpdate();
            }
        }
        return resultado == 1;
    }
}
