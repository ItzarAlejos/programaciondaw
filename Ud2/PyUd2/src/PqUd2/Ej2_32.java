/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd2;

import java.util.Scanner;


public class Ej2_32 {

    public static void main(String[] args) {
        Scanner tuberia;
       tuberia = new Scanner(System.in);
     
       
       int contador=0,sumaFamil=0,sumaAnimales=0,num;
       
       
       System.out.print("Cuantos abuelas/os tienes? " );
       num = tuberia.nextInt();
       sumaFamil = num;
       contador = (contador + 1);
       
       
       System.out.print("Cuantas primas/os tienes? " );
       num = tuberia.nextInt();
       sumaFamil = (num + sumaFamil);
       contador = (contador + 1);

       
       System.out.print("Cuantoas hermanas/os tienes? " );
       num = tuberia.nextInt();
       sumaFamil = (num + sumaFamil);
       contador = (contador + 1);


       
       System.out.print("Cuantos perros tienes? " );
       num = tuberia.nextInt();
       sumaAnimales = num;
       contador = (contador + 1);

       
       System.out.print("Cuantos gatos tienes? " );
       num = tuberia.nextInt();
       sumaAnimales = (num + sumaAnimales);
       contador = (contador + 1);


       
        System.out.println("\nHabiendo contestado a " + contador + " preguntas:");
        System.out.println("Tienes " + sumaFamil + " familiares.");
        System.out.println("Tienes " + sumaAnimales + " animales.");




    }

}
