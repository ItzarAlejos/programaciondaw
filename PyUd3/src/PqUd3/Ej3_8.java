/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_8 {

    public static void main(String[] args) {
        final int EDAD = 18;
        Scanner tuberia = new Scanner(System.in);
        int edadusu;
        String respuesta = "";
        System.out.print("Introduzca una edad: ");
        edadusu = tuberia.nextInt();

        if (edadusu < EDAD) {
            System.out.println("La persona es menor de edad");
            
                }
        else{
            
            System.out.println("La persona es mayor de edad");
        }



    }

}
