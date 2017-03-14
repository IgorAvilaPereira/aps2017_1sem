/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;



/**
 *
 * @author Lucas
 */
public class Ticket{
    private String refeicao="", sobremesa ="", bebidas="", taxa="",desconto="", cerveja, agua, suco, refri;
    private double valor, valortotal, subtotal, numero, totalcerveja, totalagua, totalsuco, totalrefri, totalsobremesa, totalbebida, txservico;
    
    
    public void ContaComida(List<String> info) {
        for (String s: info){
            if(s.equals("Filé ao Molho Madeira")){
                valor+=23;
                refeicao +="Filé ao Molho Madeira...R$ 23,00 \n\n";
            }
            if(s.equals("Filé Grelhado")){
                valor+=19;
                 refeicao +="Filé Grelhado...R$ 19,00 \n\n";
            }
            if(s.equals("Filé de Salmão Grelhado")){
                valor+=25;
                 refeicao +="Filé de Salmão Grelhado...R$ 25,00 \n\n";
            }
            if(s.equals("Bistecas Suínas Grelhadas e Defumadas")){
                valor+=22;
                 refeicao+="Bistecas Suínas Grelhadas e Defumadas...R$ 22,00 \n\n";
            }
            if(s.equals("Peito de Frango")){
                valor+=18;
                refeicao+="Peito de Frango...R$ 18,00 \n\n";
            }
            if(s.equals("Cenoura")){ 
                valor+=1;
                refeicao+="Salada de Cenoura...R$ 1,00 \n\n"; 
            }
            
            if (s.equals("Cebola")){
                valor+=1;
                refeicao+="Salada de Cebola...R$ 1,00 \n\n";
            }
            if (s.equals("Alface")){
                valor+=1;
                refeicao+="Salada de Alface...R$ 1,00 \n\n";
            }
            if (s.equals("Tomate")){
                valor+=1;
                refeicao+="Salada de Tomate...R$ 1,00 \n\n";
            }   
        }
        
    }   

    public Double ContaCerveja(Object value) {
        int quantidade = (Integer) value;
        totalcerveja = quantidade * 5;
        if(quantidade>0){
            bebidas+="\n\nCerveja: Quantidade: "+quantidade+" R$ "+totalcerveja;
        }
        return totalcerveja;
    }
    public Double ContaAgua(Object value) {
        int quantidade = (Integer) value;
        totalagua = quantidade * 2.5;
        if(quantidade>0){
            bebidas+="\n\nÁgua: Quantidade: "+quantidade+" R$ "+totalagua;
        }
        return totalagua;
    }
    public Double ContaSuco(Object value) {
        int quantidade = (Integer) value;
        totalsuco = quantidade * 4;
        if(quantidade>0){
            bebidas+="\n\nSuco: Quantidade: "+quantidade+" R$ "+totalsuco;
        }
        return totalsuco;
    }
    public Double ContaRefri(Object value) {
        int quantidade = (Integer) value;
        totalrefri = quantidade * 4;
        if(quantidade>0){
            bebidas+="\n\nRefrigerante: Quantidade: "+quantidade+" R$ "+totalrefri;
        }
        return totalrefri;
    }
    
    public void Sobremesa(Object escolha) {
        sobremesa=escolha.toString();
        if(sobremesa.equals("Sorvete")){
            totalsobremesa = 4;
            sobremesa+="...R$ 4,00";
        }
        if(sobremesa.equals("Pudim")){
            totalsobremesa = 5;
            sobremesa+="...R$ 5,00";
        }
         if(sobremesa.equals("Torta")){
            totalsobremesa = 6;
            sobremesa+="...R$ 6,00";
        }
        if(sobremesa.equals("Sagu")){
            totalsobremesa = 4;
            sobremesa+="...R$ 4,00";
        }
    }
    
    public void ValidaNumero(String text) {
        String regex = "[0-9]+";
        
        if(text.matches(regex)){
            numero= Double.parseDouble(text);
            if(numero>0){
                desconto="\n\nDesconto: R$ "+numero;
            }
        }else{
            JOptionPane.showMessageDialog(null,"Este campo só aceita números");
        }
        
    }

    public void remTXservico() {
        txservico=0;
        taxa="";
    }
    public void addTxServico() {
        txservico=0.1;
        taxa="\n\nTaxa de serviço: 10%..."+ txservico;
    }
    public void ContaTudo(){
       totalbebida=totalcerveja + totalagua + totalsuco + totalrefri;
       subtotal = valor+totalbebida+totalsobremesa-numero;
       valortotal=subtotal+(subtotal*txservico);
    }
     public String Escreve(){
        
        String ticket="Refeição:\n\n"+refeicao+sobremesa+bebidas+taxa
                      +"\n\nValor total: R$ "+valortotal;
        return ticket;
     }




}
