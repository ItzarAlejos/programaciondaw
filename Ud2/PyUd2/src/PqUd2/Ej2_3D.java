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
public class Ej2_3D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("True y true = " + (true && true));
        System.out.println("True y false = " + (true && false));
        System.out.println("false y true = " + (false && true));
        System.out.println("True y false = " + (false && false));
    
        System.out.println("----------------------------------------------------");
        System.out.println("| &&               |   true           |   false    |");
        System.out.println("----------------------------------------------------");
        System.out.println("| true             |   " + (true && true) + "           |   "+(true && false) +"    |");
        System.out.println("----------------------------------------------------");
        System.out.println("| false            |   " + (false && true) + "          |   "+(false && false) +"    |");
        System.out.println("----------------------------------------------------");
        System.out.println("\n");
        System.out.println("----------------------------------------------------");
        System.out.println("| ||               |   true           |   false    |");
        System.out.println("----------------------------------------------------");
        System.out.println("| true             |   " + (true || true) + "           |   "+(true || false) +"     |");
        System.out.println("----------------------------------------------------");
        System.out.println("| false            |    " + (false || true) + "          |   "+(false || false) +"     |");
        System.out.println("----------------------------------------------------");
        System.out.println("\n");
        System.out.println("----------------------------------------------------");
        System.out.println("| !                |   true           |   false    |");
        System.out.println("----------------------------------------------------");
        System.out.println("| true             |   " + (!true) + "           |   "+(!false) +"     |");
        System.out.println("----------------------------------------------------");
        System.out.println((5+2) > (3*2));
      
    }
    
}
