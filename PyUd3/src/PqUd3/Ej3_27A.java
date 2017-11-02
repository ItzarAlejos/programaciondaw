/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_27A {

    public static void main(String[] args) {

        Scanner tuberia = new Scanner(System.in);
        
        int numTope, contador= 0, suma= 0 , num=1, serie, sumaSerie=0;
        
        System.out.print("Introduzca el numero que será el ultimo de la serie: ");
        numTope = tuberia.nextInt();
        System.out.println(numTope);
        
        while (contador < numTope){
            
            
            suma = suma + num; //suma los numeros
           
            num = num + 1; //Genera los numeros
            contador = contador + 1;  //voy sumando el contador hasta llegar a numTope
            serie = contador;
            sumaSerie = sumaSerie + contador;
            
            System.out.print(serie + " , ");
            


        }
        System.out.println("");
        System.out.println("La suma es " + sumaSerie);



    }

}
