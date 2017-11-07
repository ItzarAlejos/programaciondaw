/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_41 {

    public static void main(String[] args) {
        
        Scanner tuberia = new Scanner(System.in);
        int cantidadPares, numPar=0, resultado=0, contador1=0;
        
        System.out.print("Escribe un numero: ");
        cantidadPares = tuberia.nextInt();
        
        
        do
        {
            numPar = numPar + 2;
            resultado = resultado + numPar;
            //System.out.println("numero: "+num);
           // System.out.println("resultador: " + resultado);
            contador1 = contador1 + 1;
        }while(cantidadPares > contador1);
        
        System.out.printf("La suma de los %d primeros números pares es de %d\n", cantidadPares, resultado);
        
        


    }

}
