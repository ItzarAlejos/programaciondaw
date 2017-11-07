/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_38C {

    public static void main(String[] args) {
        
        
        Scanner tuberia = new Scanner(System.in);
        int numIntroducido, numFinal=1000, resultado, contador=0;
        double media=0;
        
        System.out.print("Introduzca fin de la serie: ");
        numIntroducido = tuberia.nextInt();
        
        while(numIntroducido <= numFinal)
        {
            System.out.print(numFinal + "- ");
            numFinal = numFinal - 3;
            media = numFinal + media;
            contador = contador +1;
        }
        media = media / contador;
        System.out.printf("\nLa media es: %.1f.\n", media);





    }

}
