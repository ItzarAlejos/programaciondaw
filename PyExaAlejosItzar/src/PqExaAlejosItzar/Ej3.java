/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqExaAlejosItzar;

import java.util.Scanner;


public class Ej3 {

    public static void main(String[] args) {
        
        final int EDAD = 25;
        
        Scanner tuberia = new Scanner(System.in); /*Creo la tuberia*/
        double sueldo;
        int edad, divisionSueldo;  /*Creo las variables */
        
        System.out.print("Sueldo: "); /*Le pido el sueldo*/
        sueldo = tuberia.nextDouble();
        
        System.out.print("Edad: "); /*Le pido la edad*/
        edad = tuberia.nextInt();
        
        if ((edad > 25)&&(sueldo > 1000)) { /*Compruebo si la edad es mayor a 25 y si el sueldo es mayor a 10000*/
            while(sueldo > 10)
            {
                System.out.print("Nº a dividir el sueldo: "); /*Pide la division del sueldo*/
                divisionSueldo = tuberia.nextInt();
                sueldo = (sueldo/divisionSueldo); /*Divide el sueldo por el valor que le he introducido antes*/
                System.out.println("Cociente: " + sueldo); /* Muestro el sueldo*/
                
                
            }
            
            
        }
        
        
        
        

        




    }

}
