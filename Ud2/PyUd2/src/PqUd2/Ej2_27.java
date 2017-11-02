/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd2;

import java.util.Scanner;


public class Ej2_27 {

    public static void main(String[] args) {
        
       Scanner tuberia;
       tuberia = new Scanner(System.in);
       
       final int NUMSECRETO = 43;
       int numeroUsuario;
       
       System.out.print("Introduce nº: ");
       numeroUsuario = tuberia.nextInt();
       
      
       
       System.out.println("¿El nº es mayor que el secreto? " + (NUMSECRETO > numeroUsuario));
       System.out.println("¿El nº es menor que el secreto? " + (NUMSECRETO < numeroUsuario));
       System.out.println("¿El nº es igual que el secreto? " + (NUMSECRETO == numeroUsuario));


    }

}
