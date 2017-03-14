/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author root
 */
public class ComandaDAO {
    
    public void inserir(String extrato) {
        
    }
}

/* criar a conexão
    criar a string que é a instrução sql
    fazer com que a instrução vire um prepared statement
    *** substituir os pontos de interrogação -> preparedstatement.setString(1, extrato);
    manda executar ps.executeUpdate();
*/