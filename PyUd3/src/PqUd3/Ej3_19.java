/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_19 {

    public static void main(String[] args) {
        Scanner tuberia = new Scanner(System.in);
        int mes;
        
        System.out.print("Introduce un mes (nº entero): ");
        mes = tuberia.nextInt();
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            {
                System.out.println("El mes " + mes + " tiene 31 dias.");
                break;
            }
            case 4: case 6: case 9: case 11:
            {
                System.out.println("El mes " + mes + " tiene 30 dias.");
                break;
            }    
            case 2:
            {
                System.out.println("El mes " + mes + " tiene 29 dias.");
                break;
            }
            default:
            {
                System.out.println("Error... \nIntroduzca un numero entre el 1 y el 12");
            }
        }





    }

}
