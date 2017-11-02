/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;



public class Ej3_30B {

    public static void main(String[] args) {
        
       int valorRandom;
       boolean valor0=false, valor99=false;
       
        
        
 
        
        
        while((valor0 == false) || (valor99 == false)){
            valorRandom = (int) (Math.random()*100);
            //System.out.println(valorRandom);
            
                if (valorRandom == 0) 
                {
                    valor0 = true;
                    System.out.println("Ya ha entrado en 0");
                
                }
                if (valorRandom == 99)
                {
                    valor99 = true;
                    System.out.println("Ya ha entrado en 99");
                }
            
        }



    }

}
