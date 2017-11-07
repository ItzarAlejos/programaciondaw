/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_45 {

    public static void main(String[] args) {
        
        int valorRandom, numero;
       valorRandom = (int) (Math.random()*10);
        
        Scanner tuberia = new Scanner(System.in);
        do
        {
            System.out.println("Que numero es?");
            numero = tuberia.nextInt();
            if(numero > valorRandom){
                System.out.println("El numero es menor");  
            }else{
                System.out.println("El numero es mayor");
            }
            
        }while(numero != valorRandom);
        




    }

}
