/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej_3_32A {

    public static void main(String[] args) {
        
        Scanner tuberia = new Scanner(System.in);
        
        int contador=1, cantidad=0, suma=0;
        
        while (contador <= 10)
        {
            
            System.out.print("Contador : " + contador + " .Dime un numero entero: ");
            cantidad = tuberia.nextInt();
            contador = contador + 1;
            suma = suma + cantidad;
            
        }
        
        System.out.println("La suma es: " + suma);
        




    }

}
