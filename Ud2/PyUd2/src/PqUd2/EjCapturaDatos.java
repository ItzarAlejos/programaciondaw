/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd2;

import java.util.Scanner;


/**
 *
 * @author daw1
 */
public class EjCapturaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tuberia;
        tuberia = new Scanner(System.in);
        
//        int num;
//        
//        System.out.print("Entero: ");
//        num = tuberia.nextInt();
//        System.out.println(num);
        
        double numReal;
        
        System.out.print("Real: ");
        numReal = tuberia.nextDouble();
        System.out.println(numReal);
        
        boolean respuesta;
        System.out.println("Boolean: ");
        respuesta = tuberia.nextBoolean();
        System.out.println(respuesta);
        
        
        
        
    }
    
}
