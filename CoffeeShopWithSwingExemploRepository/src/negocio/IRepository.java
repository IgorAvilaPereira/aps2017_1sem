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
public interface IRepository <T> {
   void inserir(T objeto);
   void excluir(T objeto);
   // void atualizar(T objeto);
   //ArrayList<T> selecionar(String condicao);
    
}
