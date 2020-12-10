/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;
class Problema3 {
    public static void main(String[]args){
	int intcontador;
	String cadenaasterisco = ("*"),cadenaasteriscos2 = ("*");
	System.out.println(cadenaasterisco);
	for (intcontador = 1;(!(intcontador == 10)) ; intcontador++) {
            cadenaasterisco = cadenaasterisco + cadenaasteriscos2;
            System.out.println(cadenaasterisco);
	}
    }
}

