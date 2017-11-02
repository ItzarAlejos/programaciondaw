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
public class EjConverTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
                double kilometraje;
        int duplica;
        
        kilometraje= 10.5;
        duplica = 2;
        
        System.out.println("El resultado, es: " + (kilometraje*duplica));
        
        //Cuando el tipo al que se asigna un valor es mayor, la conversion se realiza
        //automaticamente =)
        
        System.out.println((int) 34.45);
        System.out.println((int) 34.78);
    }
    
}
