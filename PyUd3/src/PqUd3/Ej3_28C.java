/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_28C {

    
    public static void main(String[] args) {
        // Main Class
        
        Scanner tuberia = new Scanner(System.in);
        
        int numHijos, edad;
        boolean casado=false;
        
        System.out.println("¿Cuantos hijos tienes?");
        numHijos=tuberia.nextInt();
        
        System.out.println("¿Cual es tu edad?");
        edad=tuberia.nextInt();
        
        if ((numHijos >= 3) && (edad >= 18)) {
            
            System.out.println("¿Está casado (true/false)?");
            casado = tuberia.nextBoolean();
            
            if (casado == true){
                
                System.out.println("Ya son " + (numHijos + 2) + " en su familia numerosa");
                
            } else{
                
                System.out.println("¡A ver si te casas ya, Ronaldo que eres un Ronaldo!");
                
            }
            
        }
        
        
    }

}
