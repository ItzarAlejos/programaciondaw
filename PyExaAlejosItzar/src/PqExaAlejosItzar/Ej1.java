/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqExaAlejosItzar;

import java.util.Scanner;


public class Ej1 {

    public static void main(String[] args) {
        
        Scanner tuberia = new Scanner(System.in); /*Creo la tuberia*/
        
        int primerInt, segundoInt, numMayor, numMenor; /*Creo las variables */
        
        /*Le pido los dos enteros */
        System.out.print("Primer Entero: ");
        primerInt = tuberia.nextInt();
        
        System.out.print("Segundo entero: ");
        segundoInt = tuberia.nextInt();
        
        /*En el siguiente if lo que hago es ordenar el numero mayor y el menor
        para que luego la sentencia del while sea mas facil de entender
        */
        if (primerInt>segundoInt) 
        {
            numMayor = primerInt;
            numMenor = segundoInt;
        }
        else
        {
            numMayor = segundoInt;
            numMenor = primerInt;
        }
        
        /* En el while hago el bucle y comprueba si el numero Menor es menor o
         igual al numero Mayor
        */
        while(numMenor<=numMayor){
            
            System.out.print(numMenor + "-"); /*Cojo el numero menor y le añado el "-" */
            numMenor = numMenor + 3; /*Voy incrementandole de 3 en 3*/
            
        }
        System.out.println("");
        
    }

}
