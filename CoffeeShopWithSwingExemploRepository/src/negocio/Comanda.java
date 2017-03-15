/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Comanda {
    public static final String ID = "id";
    public static final String EXTRATO = "descricao";    
    
    private ArrayList<Prato> vetPrato;
    private String extrato;
    private int id;

    public Comanda() {
        this.vetPrato = new ArrayList();
    }

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }
    
    

    public String gerarExtrato() {
        String extrato = "";
        double valorTotal = 0.0;
        for (int i = 0; i < vetPrato.size(); i++) {
            Prato prato = vetPrato.get(i);
            extrato += prato.getNome() + " (" + prato.getValor() + "): " + prato.getValor() * prato.getQuantidadeSelecionada()+ " ... " + "\n";
            valorTotal += prato.getValor() * prato.getQuantidadeSelecionada();
        }
        this.extrato = extrato;
        return "\n"+ extrato + "\n" + "Valor total: " + valorTotal;
    }

    public ArrayList<Prato> getVetPrato() {
        return vetPrato;
    }

    public void setVetPrato(ArrayList<Prato> vetPrato) {
        this.vetPrato = vetPrato;
    }

    public int getId() {
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
}
