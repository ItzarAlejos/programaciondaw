/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_6 {

    public static void main(String[] args) {
        Scanner tuberia = new Scanner(System.in);
        double saldo, reintegro;
        int resp;
        System.out.print("Introduzca el saldo: ");
        saldo = tuberia.nextDouble();
        System.out.print("Introduzca el reintegro: ");
        reintegro = tuberia.nextDouble();

        if (reintegro <= saldo) {
                System.out.println("¿Esta usted seguro (S(0)/N(1))?");
                resp = tuberia.nextInt();      
                if (resp == 0){
                    System.out.println("Vuelve Pronto");
                }
            
                }
           
        }
    }

