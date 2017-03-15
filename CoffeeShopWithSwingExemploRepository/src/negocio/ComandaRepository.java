/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.ComandaDAO;


/**
 *
 * @author iapereira
 */
public class ComandaRepository implements IRepository<Comanda> {
    private final ComandaDAO comandaDAO;
    
    public ComandaRepository(){
        this.comandaDAO = new ComandaDAO();
    }

    @Override
    public void inserir(Comanda objeto) {
        
    }

    @Override
    public void excluir(Comanda objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<Comanda> selecionarSobremesaComFIle(String parametro) throws SQLException {        
        /*
        ConsultaSQL consultaSQL = new ConsultaSQL();
        
        
        Criterio criterio1 = new Criterio();
        criterio1.setColuna(Comanda.EXTRATO);
        criterio1.setOperador("ILIKE");
        criterio1.setValor("'%"+parametro+"%'"); 
         
        Criterio criterio2 = new Criterio();
        criterio2.setColuna(Comanda.EXTRATO);
        criterio2.setOperador("ILIKE");
        criterio2.setValor("'%Filé%'");         
        
        consultaSQL.getVetCriterio().add(criterio1);
        consultaSQL.getVetCriterio().add(criterio2);
        */
        
        
        
        //String instrucaoConsulta = "";
        //instrucaoConsulta = consultaSQL.satisfazendoCriterio();        
        
        String instrucaoConsulta = new SQLBuilder().ilike(Comanda.EXTRATO, "'%"+parametro+"%'").ilike(Comanda.EXTRATO, "'%Filé%'").gerarSQL();
        System.out.println("Instrucao:"+instrucaoConsulta);
        return comandaDAO.select(instrucaoConsulta);
    }
    
}
