/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_28B {

    
    public static void main(String[] args) {
        // Main Class
        
        Scanner tuberia = new Scanner(System.in);
        
        final double PRECIO_BEBIDO = 1.5;
        int resp, contador= 0;
        double importeTotal;
        
        System.out.print("¿Desea una bebida Sí(1)/No(0)? ");   
        resp=tuberia.nextInt();
        
        while (resp == 1){
            System.out.print("¿Desea una bebida Sí(1)/No(0)? ");
            
            resp=tuberia.nextInt();
            
            contador = contador + 1;
        
        }
        importeTotal = (contador*PRECIO_BEBIDO);
        System.out.printf("Usted se tomó " + contador + " bebidas por un importe de %.1f euros.\n", importeTotal);
        
    }

}
