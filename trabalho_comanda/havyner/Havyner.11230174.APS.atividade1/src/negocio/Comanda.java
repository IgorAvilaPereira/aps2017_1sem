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

    private ArrayList<Prato> vetPrato;

    public Comanda() {
        this.vetPrato = new ArrayList();
    }

    public String gerarExtrato() {
        String extrato = "";
        double valorTotal = 0.0;
        for (int i = 0; i < vetPrato.size(); i++) {
            Prato prato = vetPrato.get(i);
            extrato += prato.getNome() + " (" + prato.getValor() + "): " + prato.getValor() * prato.getQuantidadeSelecionada()+ " ... " + "\n";
            valorTotal += prato.getValor() * prato.getQuantidadeSelecionada();
        }
        return "\n"+ extrato + "\n" + "Valor total: " + valorTotal;
    }

    public ArrayList<Prato> getVetPrato() {
        return vetPrato;
    }

    public void setVetPrato(ArrayList<Prato> vetPrato) {
        this.vetPrato = vetPrato;
    }
    
}
