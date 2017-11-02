/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_10 {

    public static void main(String[] args) {
        int resp;
        Scanner tuberia = new Scanner(System.in);
        System.out.println("1.- Altas");
        System.out.println("2.- Bajas");
        System.out.println("0.- Salir");
        
        System.out.print("Elige una opción: ");
        resp = tuberia.nextInt();
        if (resp == 1){
            System.out.println("Eligió Altas");
        }else {
                if (resp == 2) {
                    System.out.println("Eligió Bajas");
                } else {
                        System.out.println("¿Está usted seguro? (S/N)");
                    }
             }
    }

}
