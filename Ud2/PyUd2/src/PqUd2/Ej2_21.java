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
public class Ej2_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tuberia;
        tuberia = new Scanner(System.in);
        double radio, altura,resultado;
        final double PI=3.1416;
        
        
        System.out.print("Pon el radio del cilindro: ");
        radio = tuberia.nextDouble();
        System.out.print("Pon la altura del cilindro: ");
        altura = tuberia.nextDouble();
        resultado= ((2*PI)*(radio*radio)+(2*PI)*(radio*altura));
        System.out.printf("El area del cilindro es: %.2f\n", resultado);
        
        
        
        
        
        
        
    }
    
}
