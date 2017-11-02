/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_27C {

    public static void main(String[] args) {
        
        Scanner tuberia = new Scanner(System.in);
        
        int resp=20, edad;
        
        while (!((resp==0) || (resp ==1) || (resp ==2) ||(resp ==3)))
        {
            System.out.println("VARIOPINTO");
            System.out.println("1.-Uno");
            System.out.println("2.-Dos");
            System.out.println("3.-Edad");
            System.out.print("1.-Elige una opción: ");
            resp = tuberia.nextInt();
        }
        
        switch(resp){
            
            case 1:
            {
                System.out.println("Elegiste 1.");
                break;
            }
                
            case 2:
            {
                System.out.println("Elegiste 2.");
                break; 
            }  
            case 3:
            {
                System.out.println("Introduce tu edad: ");
                edad = tuberia.nextInt();
            }
            
            default:
            {
                break;
            }
                
                
        }




    }

}
