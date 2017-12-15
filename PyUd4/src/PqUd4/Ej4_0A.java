/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd4;


public class Ej4_0A {

    public static void main(String[] args) {
        
        Rectangulo rect1, rect2;
        
        rect1 = new Rectangulo(); //Objetos
        rect2 = new Rectangulo(); //Objetos
        
        //Atributos
        
        rect1.base = 5; 
        rect1.altura = 2;
        rect1.color= "Rojo";
        rect1.SetArea();
        
        rect2.base= 4;
        rect2.altura= 5;
        rect2.color= "Blanco";
        rect2.SetArea();
        
        System.out.println("\nAtributos de RECT1:");
        System.out.println("La base es: " + rect1.base);
        System.out.println("La altura es: " + rect1.altura);
        System.out.println("El area es: " + rect1.area);
        System.out.println("El color es: " + rect1.color);
        
        
        System.out.println("\nAtributos de RECT2:");        
        System.out.println("La base es: " + rect2.base);
        System.out.println("La altura es: " + rect2.altura);
        System.out.println("El area es: " + rect2.area);
        System.out.println("El color es: " + rect2.color);
        
        rect1 = rect2; //Simplemente rect1 es un nombre que se declara al objeto pero al 
                        //hacer ese comando decimos que rect1 esta vinculado al objeto rect2.
        
        System.out.println("\nAtributos de RECT1:");
        System.out.println("La base es: " + rect1.base);
        System.out.println("La altura es: " + rect1.altura);
        System.out.println("El area es: " + rect1.area);
        System.out.println("El color es: " + rect1.color);
        
        
        System.out.println("\nAtributos de RECT2:");        
        System.out.println("La base es: " + rect2.base);
        System.out.println("La altura es: " + rect2.altura);
        System.out.println("El area es: " + rect2.area);
        System.out.println("El color es: " + rect2.color);
        





    }

}
