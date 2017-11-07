/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_39A {

    public static void main(String[] args) {
        
        Scanner tuberia = new Scanner (System.in);
        int numero;
        
        do
        {
            System.out.print("Pon un numero entre 0 y 10: ");
            numero = tuberia.nextInt();
 
        }while((numero <0)||(numero>10));
        
        System.out.println("Numero introducido: " + numero);
        
        




    }

}
