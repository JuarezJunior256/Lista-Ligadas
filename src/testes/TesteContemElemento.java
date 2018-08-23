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
public class TesteContemElemento {
    
      public static void main(String[] args) {
        
          ListaLigada  lista = new ListaLigada();
          
          lista.adiciona("Rafael");
          lista.adiciona("Paulo");
          
          System.out.println(lista.contem("Rafael"));
          System.out.println(lista.contem("Camila"));
    }
    
}
