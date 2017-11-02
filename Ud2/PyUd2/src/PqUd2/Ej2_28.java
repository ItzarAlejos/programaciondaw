/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd2;

import java.util.Scanner;


public class Ej2_28 {

    public static void main(String[] args) {

        Scanner tuberia;
       tuberia = new Scanner(System.in);
     
       int numeroUsuario;
       
       System.out.print("Introduce nº: ");
       numeroUsuario = tuberia.nextInt();
       
      
       
       System.out.println((numeroUsuario%2) == 0);

    }

}
