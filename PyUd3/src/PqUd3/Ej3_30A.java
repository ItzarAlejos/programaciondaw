/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_30A {

    public static void main(String[] args) {
        
       int valorRandom, numero;
       valorRandom = (int) (Math.random()*100);
        
        
        Scanner tuberia = new Scanner(System.in);
        
        System.out.println("Que numero es?");
        numero = tuberia.nextInt();
        
        
        
        while(!(numero == valorRandom))
        {
            
            if(numero > valorRandom){
                System.out.println("El numero introducido es mayor que el aleatorio");
                System.out.println("Que numero es?");
                numero = tuberia.nextInt();
            }
            else{
                System.out.println("El numero introducido es menor que el aleatorio");
                System.out.println("Que numero es?");
                numero = tuberia.nextInt();
            }
            
        }
        
        System.out.println("Acertaste el numero es: " + valorRandom);
        




    }

}
