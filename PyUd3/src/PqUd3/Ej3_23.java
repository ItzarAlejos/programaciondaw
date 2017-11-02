/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_23 {

    public static void main(String[] args) {
        Scanner tuberia = new Scanner(System.in);
            int num;
        
            System.out.print("Introduzca un numero entre 0 y 100: ");
            num = tuberia.nextInt();
            
            while ( !(num >= 0) && (num <= 100)){
            
            System.out.print("Introduzca un numero entre 0 y 100: ");
            num = tuberia.nextInt();

            
            
        }
            System.out.println("Nº introducido: " + num);



    }

}
