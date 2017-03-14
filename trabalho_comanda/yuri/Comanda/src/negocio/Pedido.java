/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Apresentacao.Telas;
import persistencia.Singleton;

/**
 *
 * @author yuri
 */
public class Pedido {
    Singleton singleton = new Singleton();

    //Telas tela = new Telas();
    public boolean inserir(String registro) throws SQLException {

       
        //     String reg = tela.getRegistro();

        int resultado;
        // fazer o inserir
        try (Connection connection = singleton.getConnection()) {
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
