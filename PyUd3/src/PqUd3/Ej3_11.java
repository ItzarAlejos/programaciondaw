/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_11 {

    public static void main(String[] args) {
        int resp1,resp2;
        Scanner tuberia = new Scanner(System.in);
        System.out.println("Introduzca dos números.");
        System.out.println("Número 1:");
        resp1 = tuberia.nextInt();
        System.out.println("Número 2:");
        resp2 = tuberia.nextInt();
        if (resp1 < resp2) {
            System.out.println("Números ordenados: " + resp1 + ", " + resp2);
        }
        else{
            System.out.println("Números ordenados: " + resp2 + ", " + resp1);
            
        }
    }   
}
