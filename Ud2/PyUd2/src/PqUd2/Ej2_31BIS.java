/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd2;

import java.util.Scanner;


public class Ej2_31BIS {

    public static void main(String[] args) {
        
       Scanner tuberia;
       tuberia = new Scanner(System.in);
     
       double num,acumulador;
       int contador;
       acumulador = 0.0;
       contador = 1;
       
       System.out.print("Introduzca un número real (" + contador + "ro): " );
       num = tuberia.nextDouble();
       acumulador = acumulador + num;
       contador = contador + 1;
       
       System.out.print("Introduzca un número real (" + contador + "ro): " );
       num = tuberia.nextDouble();
       acumulador = acumulador + num;
       contador = contador + 1;

       
       System.out.print("Introduzca un número real (" + contador + "ro): " );
       num = tuberia.nextDouble();
       acumulador = acumulador + num;
       contador = contador + 1;


       
       System.out.print("Introduzca un número real (" + contador + "ro): " );
       num = tuberia.nextDouble();
       acumulador = acumulador + num;
       contador = contador + 1;

       
       System.out.print("Introduzca un número real (" + contador + "ro): " );
       num = tuberia.nextDouble();
       acumulador = acumulador + num;
       contador = contador + 1;


       
        System.out.println("La suma de las cantidades es " + acumulador);



    }

}
