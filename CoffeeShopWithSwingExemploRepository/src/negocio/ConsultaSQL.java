/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class ConsultaSQL {
    private ArrayList<Criterio> vetCriterio;

    public ConsultaSQL(){
        this.vetCriterio = new ArrayList();
    }
    
    public ArrayList<Criterio> getVetCriterio() {
        return vetCriterio;
    }

    public void setVetCriterio(ArrayList<Criterio> vetCriterio) {
        this.vetCriterio = vetCriterio;
    }

    public String satisfazendoCriterio() {
        String resultado = "";
        for (int i = 0; i < vetCriterio.size(); i++) {
            Criterio criterio = vetCriterio.get(i);
            resultado +=  "("+criterio.toString() + ") AND ";            
        }
        resultado += "TRUE";
        return resultado;
    }
    
    
    
}
