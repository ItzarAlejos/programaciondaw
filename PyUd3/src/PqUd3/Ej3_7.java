/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_7 {

    public static void main(String[] args) {
        Scanner tuberia = new Scanner(System.in);
        int dia, mes, anyo;
        String mensaje="";
        
        System.out.print("Introduce un dia (1..31): ");
        dia = tuberia.nextInt();
        
        System.out.print("Introduce un mes (1..12): ");
        mes = tuberia.nextInt();
        
        System.out.print("Introduce un año (1990..2100): ");
        anyo = tuberia.nextInt();
        
        if ((dia < 1) || (dia > 31)) {
            
            mensaje = mensaje + "Dia no valido. ";
           
            
        }
        
        if ((mes < 1) || (mes > 12)) {
            
            mensaje = mensaje + "Mes no valido. ";
           
            
        }
        
         if ((anyo < 1990) || (anyo > 2100)) {
            
            mensaje = mensaje + "Año no válido. ";
           
            
        }
        
        if (mensaje == ""){
            
            System.out.println(dia + "/" + mes + "/" + anyo);
            
        }
        System.out.println(mensaje);
            
    }
   
           
 }
    

