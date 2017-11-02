/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_28A {

    
    public static void main(String[] args) {
        // Main Class
        
        Scanner tuberia = new Scanner(System.in);
        
        int valorInicial, valorFinal;
        
        System.out.print("Introduce el número (entero positivo) en el que comenzará la serie: ");
        valorInicial = tuberia.nextInt();
        
        System.out.print("Introduce el número (entero positivo) en el que finalizará la serie: ");
        valorFinal = tuberia.nextInt();
        
        while (valorInicial < valorFinal){
            System.out.print(valorInicial + "-");
            valorInicial= valorInicial + 1;
        }
        
    }

}
