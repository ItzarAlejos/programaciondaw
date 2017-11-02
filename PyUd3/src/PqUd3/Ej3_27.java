/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;

import java.util.Scanner;


public class Ej3_27 {

    public static void main(String[] args) {
        Scanner tuberia = new Scanner(System.in);
        
        int inicio, fin, num, k, vMayor, vMenor;
        
        System.out.print("Valor inicial: ");
        inicio = tuberia.nextInt();
        System.out.print("Valor final: ");
        fin = tuberia.nextInt();
        
        if(inicio >= fin){
            
            vMayor = inicio;
            vMenor = fin;
        }
        else
        {
            vMayor = fin;
            vMenor = inicio;
        }
        
        num = (fin-inicio);
        
        k = 1;
        while(k <= num){
            System.out.println("Entro " + k);
            k = k + 1;
            
        }
        
        



    }

}
