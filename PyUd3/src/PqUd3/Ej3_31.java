/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Modifica el 3.30A para que en caso de acioerto muestre el numero de intentos.

package PqUd3;

import java.util.Scanner;


public class Ej3_31 {

    public static void main(String[] args) {
        
       int valorRandom, numero, contador=1;
       valorRandom = (int) (Math.random()*100);
        
        
        Scanner tuberia = new Scanner(System.in);
        
        System.out.println("Que numero es?");
        numero = tuberia.nextInt();
        
        
        
        while(!(numero == valorRandom))
        {
            
            if(numero > valorRandom){
                System.out.println("Introduce un numero menor");
                System.out.println("Que numero es?");
                numero = tuberia.nextInt();
            }
            else{
                System.out.println("Introduce un numero mayor");
                System.out.println("Que numero es?");
                numero = tuberia.nextInt();
            }
            
            contador = contador + 1;
            
        }
        
        System.out.println("Lo has echo en " + contador + " intentos");
        System.out.println("Acertaste el numero es: " + valorRandom);
        
        




    }

}
