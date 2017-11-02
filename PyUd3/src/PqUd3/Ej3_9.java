/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_9 {

    public static void main(String[] args) {
        int num;
        Scanner tuberia = new Scanner(System.in);
        System.out.print("Introduzca numero entero: ");
        num = tuberia.nextInt();

        if ((num%2)==0) {
            System.out.println("El numero " + num + " es par");
            
                }
        else{
            
            System.out.println("El numero " + num + " es impar");
        }



    }

}
