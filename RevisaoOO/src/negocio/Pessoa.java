/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Pessoa {
    protected String nome;
    protected IProtecao protecao;
    
    public abstract void executarProtecao();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public IProtecao getProtecao() {
        return protecao;
    }

    public void setProtecao(IProtecao protecao) {
        this.protecao = protecao;
    }
    
    
    
}
