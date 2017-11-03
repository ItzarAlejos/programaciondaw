/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_34 {

    public static void main(String[] args) {
        
        final int MAXALUMNOS = 5;
        
        Scanner tuberia = new Scanner(System.in);
        
        int contador=1, calificacion, valorMin=0, suma=0;
        double media;
        
        while(contador <= MAXALUMNOS)
        {
            System.out.print("Nota de el " + contador + "º Alumno/a: ");
            calificacion = tuberia.nextInt(); 
            if(calificacion > valorMin)
            {
                valorMin = calificacion;
            }
            
            suma = suma + calificacion;
            contador = contador + 1;
        }
        
        media = suma/MAXALUMNOS;
        
        System.out.printf("La media es: %.2f\n",media);
        System.out.println("El minimo es: " + valorMin);
       



    }

}
