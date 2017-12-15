/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd4;


public class Principal {

    public static void main(String[] args) {
        
        //Declaramos variables(rect1, rect2) objetos Rectangulo
        
        Rectangulo rect1, rect2;
        
        //Creamos el objeto(Instancia) mediante el metodo constructor rectangulo que lo ha creado java.
        
        rect1 = new Rectangulo();
        
        //Asignamos valores a los atributos del objeto(rect1)
        
        rect1.base = 8;
        rect1.altura= 2;
        rect1.color="rojo";
        
        System.out.println("Area del rectangulo rect1: " + rect1.area);
        rect1.SetArea();
        System.out.println("Area del rectangulo rect1: " + rect1.area);
        
        //rect2-------------
        
        rect2 = new Rectangulo();
        rect2.base=15.8;
        rect2.altura=12.5;
        rect2.color="Negro";
        
        System.out.println("Area del rectangulo rect2: " + rect2.area);
        rect2.SetArea();
        System.out.println("Area del rectangulo rect2: " + rect2.area);
        
        
        







    }

}
