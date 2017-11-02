/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd2;

import java.util.Scanner;


public class Ej2_34D1 {

    public static void main(String[] args) {
       Scanner tuberia;
       tuberia = new Scanner(System.in);
       
       boolean resp;
       
       resp = true;
       
       System.out.print("Esta diciendo la verdad? true/false\n");
       resp = (tuberia.nextBoolean() && resp); 
            
       System.out.print("Esta diciendo la verdad? true/false\n");
       resp = (tuberia.nextBoolean() && resp); 

       
       System.out.print("Esta diciendo la verdad? true/false\n");
       resp = (tuberia.nextBoolean() && resp); 

        System.out.println("\n¿Usted dijo la verdad? Resp: " + resp);




    }

}
