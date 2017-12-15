/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;

/**
 *
 * @author daw1
 */
public class UtilMatem {
    
    double calcMedia(int num1, int num2, int num3){
        double media;
        
        media = (num1 + num2 + num3)/3.0;
        
        return media;
    }
    
    int potencia(int num1, int num2){
        
        int rdo=1;
        
        
        for (int k = 1; k <= num2; k++) {
            
            rdo = rdo * num1;
            
        }
        
        
        return rdo;
    }
    
    
    
}
