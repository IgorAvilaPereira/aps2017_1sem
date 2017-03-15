/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import negocio.Comanda;
import negocio.ComandaRepository;
import persistencia.ComandaDAO;

/**
 *
 * @author iapereira
 */
public class Terminal {
    public static void main(String[] args) throws SQLException {
        //ComandaDAO comandaDAO = new ComandaDAO();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite aqui o a sobremesa da base de dados das comandas:");
        String consulta = entrada.nextLine();
        //int x = entrada.nextISnt();
        
        //System.out.println("Parametro:"+consulta);
        //System.out.println("Inteiro:"+x);S
        
        ComandaRepository comandaRepository = new ComandaRepository();
        ArrayList<Comanda> vetComanda = comandaRepository.selecionarSobremesaComFIle(consulta);
        for (int i = 0; i < vetComanda.size(); i++) {
            Comanda comanda = vetComanda.get(i);
            System.out.println("===================");
            System.out.println("Comanda: ("+comanda.getId()+"):"+comanda.getExtrato());
            System.out.println("===================");
        }
    }
    
}
