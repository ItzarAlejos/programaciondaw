/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_17 {

    public static void main(String[] args) {
        int valor;
        Scanner tuberia = new Scanner(System.in);
        System.out.print("Introduzca una nota de un alumno: ");
        valor = tuberia.nextInt();
        
        switch (valor){
            case 1: case 2: case 3: case 4:
            {
                System.out.println("Suspendido");
                break;
            }
            case 5:
            {
                System.out.println("Aprobado");
                break;
            }
            case 6:
            {
                System.out.println("Bien");
            }
            case 7: case 8:
            {
                System.out.println("Notable");
                break;
            }
            case 9: case 10:
            {
                System.out.println("Sobresaliente");
                break;
            }
            
            default :
            {
                System.out.println("No presentado");
                valor = -1;
                System.out.println("Nota: " + valor);
                
                break;
            }
            
            
        }
        System.out.println("Nota: " + valor);
        
    }   
}
