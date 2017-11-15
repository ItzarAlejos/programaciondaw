/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqExaAlejosItzar;

import java.util.Scanner;


public class Ej2 {

    public static void main(String[] args) {

        Scanner tuberia = new Scanner(System.in); /*Creo la tuberia*/
        
        int opcion, parche=0; /* Creo las variables la variable parche es la que utiliza para salir de los bucles*/
        
        
        while(parche == 0){
            System.out.println("4.- Cuatro.");
            System.out.println("5.- Telecinco.");
            System.out.println("6.- La Sexta"); /*Muestro el menu*/
            System.out.println("7.- Teledeporte.");
            System.out.println("8.- GOL TV.");
            System.out.println("0.- Salir.\n\n");
        
            System.out.print("Elige una opción: ");
            opcion = tuberia.nextInt();
            
        
        
            switch (opcion) { /*Compruebo cada opcion y digo la solucion que toca*/
                case 4:
                {
                    System.out.println("Viendo Cuatro\n");
                    parche = 1;
                    break;
                }
                case 5:
                {
                    System.out.println("Viendo Telecinco\n");
                    parche = 1;
                    break;
                }
                case 6:
                {
                    System.out.println("Viendo La sexta\n");
                    parche = 1;
                    break;
                }
                case 7: case 8:
                {
                    System.out.println("Viendo Deportes\n");
                    parche = 1;
                    break;
                }
                case 0:
                {
                    System.out.print("¿Está usted seguro? (S/N) ");
                    parche = 1;
                    
                    break;
                }
                default:
                {
                    break;
                }
            }
            
        }
        System.out.println("");
    }




}


