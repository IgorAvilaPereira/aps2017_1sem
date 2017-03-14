/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yuri
 */
public class Singleton {

    private static Singleton instancia = null;
    private Connection conexao;
    private String host;
    private String porta;
    private String usuario;
    private String senha;
    private String banco;

    public Singleton() {
        this.host = "localhost";
        this.porta = "5432";
        this.usuario = "postgres";
        this.senha = "postgres";
        this.banco = "revisaooo";
    }

    public static synchronized Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }

        return instancia;
    }

    public Connection Conexao() {
        String url = "jdbc:postgresql://" + this.getHost() + ":" + this.getPorta() + "/" + this.getBanco();

        try {
            System.out.println("Deu show...");
            return DriverManager.getConnection(url, this.getUsuario(), this.getSenha());

        } catch (SQLException ex) {

            System.out.println("deu erro");
            System.exit(0);
        }

        return null;
    }

    /**
     * @return the conexao
     */
    public Connection getConexao() {
        return conexao;
    }

    /**
     * @param conexao the conexao to set
     */
    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the porta
     */
    public String getPorta() {
        return porta;
    }

    /**
     * @param porta the porta to set
     */
    public void setPorta(String porta) {
        this.porta = porta;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
