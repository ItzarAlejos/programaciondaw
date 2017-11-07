/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;


public class Ej3_36 {

    public static void main(String[] args) {

        int contador=0, contador1=0,resultado;
        
        while (contador <=10)
        {
            
            while(contador1 <=10)
            {
                resultado = contador * contador1;
                System.out.println(contador + " x " + contador1 + " = " + resultado);
                contador1 = contador1 + 1;
            }
            
            System.out.println("\n");
            contador = contador +1;
            contador1 = 0;
        }


    }

}
