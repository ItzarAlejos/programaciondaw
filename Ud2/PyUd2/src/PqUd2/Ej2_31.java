/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd2;

import java.util.Scanner;


public class Ej2_31 {

    public static void main(String[] args) {
        
       Scanner tuberia;
       tuberia = new Scanner(System.in);
     
       double num,acumulador;
       acumulador = 0.0;
       
       System.out.print("Introduzca un número real (1ro : ");
       num = tuberia.nextDouble();
       acumulador = acumulador + num;
       
       System.out.print("Introduzca un número real (2ro : ");
       num = tuberia.nextDouble();
       acumulador = acumulador + num;
       
       System.out.print("Introduzca un número real (3ro : ");
       num = tuberia.nextDouble();
       acumulador = acumulador + num;

       
       System.out.print("Introduzca un número real (4ro : ");
       num = tuberia.nextDouble();
       acumulador = acumulador + num;

       
       System.out.print("Introduzca un número real (5ro : ");
       num = tuberia.nextDouble();
       acumulador = acumulador + num;

       
        System.out.println("La suma de las cantidades es " + acumulador);

    }

}
