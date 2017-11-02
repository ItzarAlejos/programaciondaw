/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_29B {

    public static void main(String[] args) {
        
        final double APUESTAMAXIMA = 1000.0;
        int contador=0;
        double apuestaInicial, apuestaDoble;
        
        Scanner tuberia = new Scanner(System.in);
        
        System.out.print("Apuesta inicial: ");
        apuestaInicial = tuberia.nextDouble();
        
        while(apuestaInicial <= APUESTAMAXIMA)
        {
            apuestaInicial = apuestaInicial*2;
            System.out.println("¡Dobló apuesta!");
            System.out.println("Su nueva apuesta es de " + apuestaInicial + "€.");
            contador = contador + 1;
            
            
        }
        
        System.out.println(apuestaInicial/2);
        System.out.println("La apuesta " + contador);
        
        
        
        




    }

}
