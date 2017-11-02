/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_29 {

    public static void main(String[] args) {
        
        Scanner tuberia = new Scanner(System.in);
        
        int numBinario,resto;
        String cadBinario = "";
        
        System.out.print("Escribe el número positivo que quieres pasar a binario: ");
        numBinario = tuberia.nextInt();
        
        
        
        while(numBinario >= 2)
        {
            resto = (numBinario%2);
            cadBinario = (resto + cadBinario);
            numBinario = (numBinario/2);
         
        }
        
        cadBinario = numBinario + cadBinario;
        
        System.out.println("El número en binario es: " + cadBinario);
        
        




    }

}
