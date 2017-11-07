/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_47 {

    public static void main(String[] args) {
        Scanner tuberia = new Scanner(System.in);
        boolean pregunta;
        int apuesta, sumaApuesta=0;
        do
        {
            System.out.print("Cuantas apuestas desea realizar: ");   
            apuesta =tuberia.nextInt();
            sumaApuesta = sumaApuesta + apuesta;
            System.out.print("Quieres realizar mas apuestas (true/false): ");
            pregunta = tuberia.nextBoolean();
        }while(pregunta != false); //podria ser (pregunta == true) o también podria ser (pregunta) ya que siempre es positivo.
       
        if (sumaApuesta <= 10) {
            System.out.println("¡Vete al banco a sacar dinero. ¡YA!");
        }
        if ((sumaApuesta > 10)&&(sumaApuesta < 30)) {
            System.out.println("De acuerdo, pero volveremos a verte...seguro");
            
        }
        if (sumaApuesta >= 30) {
            System.out.println("¿Quiere tomar algo?");
            
        }
        


    }

}
