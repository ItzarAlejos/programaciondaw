/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd2;

/**
 *
 * @author daw1
 */
public class Ej2_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double DOLAR = 0.923;
        String nombre = "Itzar";
        String apellidos = " Alejos Gonzalez";
        double miSaldo = 1200;
        
        
        
        System.out.println("Mi nombre es " + nombre + apellidos + ".\n");
        System.out.println("Mi saldo de " + miSaldo + "equivale a " 
                + (miSaldo*DOLAR) + " dólares");
    }
    
}
