/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_29A {

    public static void main(String[] args) {
        
        Scanner tuberia = new Scanner(System.in);
        int longNumero,numeros;
        String cadena = "";
        
        System.out.println("Cantidad de numeros ");
        longNumero = tuberia.nextInt();
        
        while(longNumero >= 1)
        {
            
            System.out.print("Introduzca nº: "); //Le pedimos los numeros
            numeros = tuberia.nextInt();
            
            cadena = (cadena + numeros);
            
            longNumero = longNumero - 1;
        }
        
        System.out.println("La cadena resultante es: " + cadena);




    }

}
