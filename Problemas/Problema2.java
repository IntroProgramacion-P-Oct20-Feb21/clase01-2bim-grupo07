/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;
public class Problema2 {
    public static void main(String[] args) {
        String cadena = "Loja,Quito,Ecuador";
        String reporte = "";
        int valor;
        int minuscula = 0;
        int mayuscula = 0;
        for (int i = 0; i < cadena.length(); i++) {
            reporte = String.format("%s%s", reporte, cadena.charAt(i));
            char v = cadena.charAt(i);
            valor = (int)v;
            for (int j = 97; j <= 122; j++) {
                if (valor == j) {
                minuscula = minuscula + 1;
                }
            }
            for (int j = 65; j <= 90; j++) {
                if (valor == j) {
                    mayuscula = mayuscula + 1;
                }
            }
        }
        System.out.printf("%s\nEn la frase predeterminada existen %d minusculas"
                + " y %d mayusculas\n" 
                , reporte,minuscula, mayuscula);
    }   
}
