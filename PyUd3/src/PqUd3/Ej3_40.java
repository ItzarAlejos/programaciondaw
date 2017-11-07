/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_40 {

    public static void main(String[] args) {
        
        Scanner tuberia = new Scanner(System.in);
        int num;
        do
        {
            System.out.println("0. - Jugetes");
            System.out.println("1. - Moda Infantil");
            System.out.println("2. - Deportes\n");
            System.out.print("Elige una opción: ");
            num = tuberia.nextInt();
        }while((num<0) || (num>2));
            
            switch(num){
                case 0:
                {
                    System.out.println("Yendo a planta \"Jugetes\"");
                    break;   
                }
                case 1:
                {
                    System.out.println("Yendo a planta \"Moda Infantil\"");
                    break;
                }
                case 2:
                {
                    System.out.println("Yendo a planta \"Deportes\"");
                    break;
                }
                default:
                {
                    
                    break;
                }
                    
            }
            
       




    }

}
