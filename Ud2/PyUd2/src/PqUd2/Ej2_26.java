/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd2;

import java.util.Scanner;


public class Ej2_26 {

    public static void main(String[] args) {

        Scanner tuberia;
        tuberia = new Scanner(System.in);
        
        double lado,base,area,altura,perimetro;
        
        System.out.print("Pon el valor del lado del triangulo: ");
        lado = tuberia.nextDouble();
        
        perimetro = 3*lado;
        
        altura = Math.sqrt((lado*lado)-(lado/2)*(lado/2));
        
        area = lado*(altura/2);
        System.out.printf("El area del triangulo de lado %.3fcm es: %.3fcm. El perimetro es: %.3fcm\n",lado,area, perimetro);


    }

}
