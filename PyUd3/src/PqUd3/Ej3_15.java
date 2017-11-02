/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_15 {

    public static void main(String[] args) {
        int valor;
        String resp1="uno",resp2="dos",resp3="tres";
        Scanner tuberia = new Scanner(System.in);
        System.out.print("Introduzca un numero entero entre 1 y 3: ");
        valor = tuberia.nextInt();
        
        switch (valor){
            case 1:
            {
                System.out.println("Valor es " + resp1);
                break;
            }
            case 2:
            {
                System.out.println("Valor es " + resp2);
                break;
            }
            case 3:
            case 4:
            {
                System.out.println("Valor es " + resp3);
                break;
            }
            
            default :
            {
                System.out.println("Valor NO está entre 1 y 3");
                break;
            }
            
        }
        
    }   
}
