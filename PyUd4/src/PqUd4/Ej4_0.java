/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd4;


public class Ej4_0 {

    public static void main(String[] args) {
        
        double mediaAltura, mediaBase;
        //Creamos variables
        
        Rectangulo rect1, rect2;
        
        
        //Creamos objetos
        
        rect1 = new Rectangulo();
        rect2 = new Rectangulo();
        
        //Asignamos valores a rect1
        
        rect1.altura=10;
        rect1.base=5;
        
        //Asignamos valores a rect2
        
        rect2.altura=30;
        rect2.base=15;
        
        mediaAltura = (rect1.altura+rect2.altura)/2;
        mediaBase = (rect1.base+rect2.base)/2;
        
        mediaAltura = rect1.altura;
        mediaBase = rect1.base;
        
        System.out.println("La altura media es: " + rect1.altura + ". La base media es de: " + rect1.base + ".");
        
        
        





    }

}
