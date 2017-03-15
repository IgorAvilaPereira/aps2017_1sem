/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author root
 */
public class Prato {
 
    private String nome = "";
    private double valor = 0.0;
    private int quantidadeSelecionada = 0;

    public Prato(String nome, double valor, int qtde) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeSelecionada = qtde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeSelecionada() {
        return quantidadeSelecionada;
    }

    public void setQuantidadeSelecionada(int quantidadeSelecionada) {
        this.quantidadeSelecionada = quantidadeSelecionada;
    }
    
    
}
