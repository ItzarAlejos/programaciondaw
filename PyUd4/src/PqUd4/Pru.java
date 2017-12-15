/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd4;

import java.util.Scanner;


public class Pru {

    public static void main(String[] args) {
        
        int k=1, contador=0;
        
        Scanner tuberia = new Scanner(System.in);
        
        /*do {
            Alumno al1 ;
            al1 = new Alumno();
            contador = contador + 1;
        } while (k == 0);*/
        
        int y=1;
        
        Alumno misAlumnos[] = new Alumno[99];
        
        for(int x = 0;x < y; ){
            misAlumnos[x] = new Alumno();
            System.out.println("Creado el alumno" + x);
        }
        
        System.out.println("Ya ha terminado");
        y = tuberia.nextInt();
        





    }

}
