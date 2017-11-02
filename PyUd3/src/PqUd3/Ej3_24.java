/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_24 {

    public static void main(String[] args) {
        Scanner tuberia = new Scanner(System.in);
        int num, contador=1, valor=0;
        
        System.out.println("Introduzca un numero entero mayor que 1: ");
        num = tuberia.nextInt();
        
        while (contador <= num){
            valor = valor + contador;
            contador ++;
            
        }
        
        System.out.println(valor);
        
        



    }

}
