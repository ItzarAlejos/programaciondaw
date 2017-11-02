/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_25 {

    public static void main(String[] args) {
        Scanner tuberia = new Scanner(System.in);
        int num=2, numTope, contador=1, suma=0;
        
        System.out.println("Dime un valor: ");
        numTope = tuberia.nextInt();
        
        while (contador <= numTope){
            
            //System.out.println(num);
            suma = suma + num; //suma los numeros
           
            num = num + 1; //Genera los numeros
            contador = contador + 1;  //voy sumando el contador hasta llegar a numTope

            
        }
        
        System.out.println(suma);
        
        



    }

}
