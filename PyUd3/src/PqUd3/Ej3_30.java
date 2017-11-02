/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_30 {

    public static void main(String[] args) {
        
        final int VALOR = 10;
        
        int numero;
        
        Scanner tuberia = new Scanner(System.in);
        
        System.out.println("Que numero es?");
        numero = tuberia.nextInt();
        
        while(!(numero == VALOR))
        {
            
            if(numero > VALOR){
                System.out.println("Mayor");
                System.out.println("Que numero es?");
                numero = tuberia.nextInt();
            }
            else{
                System.out.println("Menor");
                System.out.println("Que numero es?");
                numero = tuberia.nextInt();
            }
            
        }
        
        System.out.println("Acertaste el numero es: " + VALOR);
        




    }

}
