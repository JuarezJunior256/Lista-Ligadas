/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import vetores.ListaLigada;

/**
 *
 * @author junior
 */
public class TesteRemovePorPosicao {
    
      public static void main(String[] args) {
        
          ListaLigada  lista = new ListaLigada();
          
          lista.adiciona("Rafael");
          lista.adiciona("Paulo");
          lista.adiciona("Camila");
          
          lista.remove(1);
          
          System.out.println(lista);
    }
    
}
