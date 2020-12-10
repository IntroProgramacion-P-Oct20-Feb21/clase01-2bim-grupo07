/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;
public class Problema1 {
     public static void main(String[] args) {
        String cadena = "aeiou";
        char valor;
        int valornumerico;
        
        System.out.println(cadena.length()); 
        
        for (int i = 0; i < cadena.length(); i++) {
            valor = cadena.charAt(i); 
                                       
            valornumerico = (int) valor;  
            System.out.printf("%s (%d)\n", valor, valornumerico);
        }
    }
}
