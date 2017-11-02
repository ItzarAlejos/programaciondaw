/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;


public class Ej3_19A {
    
    public enum diasLectivos {Lunes, Martes, Miercoles, Jueves, Viernes}

    public static void main(String[] args) {
        
        diasLectivos diaHoy, diaFestivos;
        
        diaHoy = diasLectivos.Martes;
        diaFestivos = diasLectivos.Miercoles;
        
        System.out.println("Hoy es: " + diaHoy);
        System.out.println("El proximo dia festivo es: " + diaFestivos);




    }

}
