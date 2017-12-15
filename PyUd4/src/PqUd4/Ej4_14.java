/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd4;

import java.util.Scanner;


public class Ej4_14 {

    public static void main(String[] args) {
        
        Scanner tuberia = new Scanner(System.in);
        
        int nuevaEdad;
        
        Alumno al1 = new Alumno();
        
        al1.setAnyoNacimiento(2000);
        nuevaEdad = al1.calculaEdad(2017);
        al1.setEdad(nuevaEdad);
        
        System.out.println("Tines tantos años: " + al1.edad);




    }

}
