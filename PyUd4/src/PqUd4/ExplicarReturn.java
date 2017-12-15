/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class ExplicarReturn {
    
    int suma(){
        int a, b, rdo;
        a=2;
        b=5;
        rdo = (a+b);
        
        return rdo;
    }
    
    int sumaUsuario(){ //El int es de lo que sea el returno en este caso int.
        Scanner tuberia = new Scanner(System.in);
        int resultado = 0, a, b;
        
        System.out.print("Sumar valor 1: ");
        a = tuberia.nextInt();
        
        System.out.print("Sumar valor 2: ");
        b = tuberia.nextInt();
        
        resultado =(a+b);
        
        return resultado;
    }
    
    
    
    
    
}
