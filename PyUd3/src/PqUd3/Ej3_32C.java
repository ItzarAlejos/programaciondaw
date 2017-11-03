/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_32C {

    public static void main(String[] args) {
        
        Scanner tuberia = new Scanner (System.in);
        
        int num, sum=0;
        
        System.out.print("Introduce un numero: ");
        num = tuberia.nextInt();
        
        while(num != 0)
        {
            sum = sum + num;
            System.out.print("Introduzca OTRO numero: ");
            num = tuberia.nextInt();
        }
        
        System.out.println("El total es: " + sum);




    }

}
