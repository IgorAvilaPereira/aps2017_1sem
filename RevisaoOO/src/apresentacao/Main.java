/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.sql.SQLException;
import java.util.Scanner;
import negocio.*;
import persistencia.Conexao;
import persistencia.PessoaFisicaDAO;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        PessoaFisica objIgor = new PessoaFisica();
        
        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
        Scanner entrada = new Scanner(System.in);
        objIgor.setNome(entrada.nextLine());
        objIgor.setCpf(entrada.nextLine());
        pessoaFisicaDAO.inserir(objIgor);
        
        /*
        objIgor.setProtecao(new KungFu());
        objIgor.executarProtecao();
        objIgor.setProtecao(new Judo());
        objIgor.executarProtecao();
        
        PessoaJuridica objTinder = new PessoaJuridica();
        objTinder.setNome("Tinder LTDA");
        objTinder.setCnpj("111111111");
        objTinder.setProtecao(new Alarme());
        objTinder.executarProtecao();
        
        Conexao conexao = new Conexao();
        conexao.getConnection();
        */
    }
    
}
