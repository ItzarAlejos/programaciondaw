/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;


public class EjEnum {
    
    public enum turnoClasse {MAÑANA, TARDE}

    public static void main(String[] args) {
        
        turnoClasse turnDAW;
        turnDAW = turnoClasse.TARDE;
        System.out.println("El turno de DAW es: " + turnDAW);



    }

}
