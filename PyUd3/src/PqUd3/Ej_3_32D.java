/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej_3_32D {

    public static void main(String[] args) {
        
        Scanner tuberia = new Scanner(System.in);
        
        int cantidad=0, suma=0;
        
        
        while ((cantidad%2)==0)
        {
            System.out.print("Introduce un numero par: ");
            cantidad = tuberia.nextInt();
            suma = suma + cantidad;
            
        }
        
        System.out.println("La suma es: " + suma);
        




    }

}
