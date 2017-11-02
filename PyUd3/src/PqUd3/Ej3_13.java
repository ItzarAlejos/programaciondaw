/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_13 {

    public static void main(String[] args) {
        Scanner tuberia = new Scanner(System.in);
        double saldo, reintegro;
        int resp;
        System.out.print("Introduzca el saldo: ");
        saldo = tuberia.nextDouble();
        System.out.print("Introduzca el reintegro: ");
        reintegro = tuberia.nextDouble();

        if (reintegro <= saldo) {
                System.out.println("¿Esta usted seguro (Sí(1)/SI(1) ó si(3)/NO(4))?");
                resp = tuberia.nextInt();      
                if ((resp == 1) || (resp == 2) || (resp == 3))
                {
                    System.out.printf("Le queda de saldo: %.1f\n", (saldo - reintegro));
                    
                }else{ 
                    System.out.printf("Su saldo es de: %.1f\n", saldo);
            
                }
        }
           
        }
    }
    

